package com.jalilzod_art.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false,name="id")
    private Long  id;

    @Column(name="bio")
    private String bio;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="date_of_birth")
    private Date dateOfBirth;

    @Column(name="loyalty_points")
    private int loyaltyPoints;

    @OneToOne
    @JoinColumn(name="id")
    @MapsId
    private User user;
}
