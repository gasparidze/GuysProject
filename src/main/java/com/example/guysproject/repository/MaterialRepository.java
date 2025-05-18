package com.example.guysproject.repository;

import com.example.guysproject.entity.Material;
import com.example.guysproject.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MaterialRepository extends JpaRepository<Material, UUID> {
}
