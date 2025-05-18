package com.example.guysproject.repository;

import com.example.guysproject.entity.StaffType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StaffTypeRepository extends JpaRepository<StaffType, UUID> {
}
