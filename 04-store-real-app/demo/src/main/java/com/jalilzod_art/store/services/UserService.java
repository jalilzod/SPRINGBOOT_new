package com.jalilzod_art.store.services;


import com.jalilzod_art.store.entities.Address;
import com.jalilzod_art.store.entities.Profile;
import com.jalilzod_art.store.entities.User;
import com.jalilzod_art.store.repositories.AddressRepository;
import com.jalilzod_art.store.repositories.ProfileRepository;
import com.jalilzod_art.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;
    private final EntityManager entityManager;
    private final ProfileRepository profileRepository;
    private final AddressRepository addressRepository;

    public void showEntityState(){
        Profile profile = profileRepository.findById(1L).orElseThrow();
        //System.out.println(profile.getUser().getEmail());
    }

    public void fetchAddress(){
       Address address = addressRepository.findById(1L).orElseThrow();
        System.out.println(address);
    }

    public void persistUser(){
        User user = User.builder()
                .name("Yuan")
                .email("yuan@@.com")
                .password("123456")
                .build();

        Address address = Address.builder()
                .city("Beijing")
                .state("Hubei")
                .street("Tang")
                .zip("zip")
                .build();

        user.addAddress(address);
        userRepository.save(user);
    }

    public void deleteUser(){
        User user = userRepository.findById(1L).orElseThrow();
        userRepository.delete(user);
    }
}
