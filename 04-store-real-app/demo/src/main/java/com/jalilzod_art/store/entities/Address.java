package com.jalilzod_art.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Builder
@Table(name="addresses")
public class Address {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="zip")
    private String zip;

    @ManyToOne(fetch=FetchType.LAZY)
    @ToString.Exclude
    @JoinColumn(name="user_id")
    private User user;


}
