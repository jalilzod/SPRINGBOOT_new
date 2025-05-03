package com.jalilzod_art.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name="password")
    private String password;

    @OneToMany(mappedBy = "user",cascade = {CascadeType.PERSIST,CascadeType.REMOVE},orphanRemoval = true)
    @Builder.Default
    private List<Address>addresses = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name  = "user_tags",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="tag_id")
    )
    private Set<Tag>tags = new HashSet<>();

    @OneToOne(mappedBy = "user",cascade = CascadeType.REMOVE)
    private Profile profile;

    @ManyToMany
    @JoinTable(
            name = "wishlist",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name="product_id")
    )
    private Set<Product>wishProducts = new HashSet<>();

    public void addAddress(Address address) {
        addresses.add(address);
        address.setUser(this);
    }

    public void removeAddress(Address address) {
        addresses.remove(address);
        address.setUser(null);
    }

    public void addTag(String tagName) {
        Tag tag1 = new Tag(tagName);
        tags.add(tag1);
        tag1.getUsers().add(this);
    }

    public void removeTag(String tagName) {
        Tag tag1 = new Tag(tagName);
        tags.remove(tag1);
        tag1.getUsers().remove(this);
    }

    public void addFavoriteProduct(Product product) {
        wishProducts.add(product);
    }
}





