package com.jalilzod_art.store.repositories;

import com.jalilzod_art.store.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Byte> {
}