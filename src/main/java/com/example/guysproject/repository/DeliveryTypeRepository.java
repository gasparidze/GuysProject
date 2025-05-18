package com.example.guysproject.repository;

import com.example.guysproject.entity.DeliveryType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeliveryTypeRepository extends JpaRepository<DeliveryType, UUID> {
}
