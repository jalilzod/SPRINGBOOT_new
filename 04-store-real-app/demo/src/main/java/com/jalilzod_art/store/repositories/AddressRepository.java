package com.jalilzod_art.store.repositories;

import com.jalilzod_art.store.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
