package com.jalilzod_art.store.repositories;

import com.jalilzod_art.store.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}