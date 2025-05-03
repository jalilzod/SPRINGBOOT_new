package com.jalilzod_art.store.repositories;

import com.jalilzod_art.store.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}