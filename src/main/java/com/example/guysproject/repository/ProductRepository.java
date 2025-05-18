package com.example.guysproject.repository;

import com.example.guysproject.entity.Product;
import com.example.guysproject.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
