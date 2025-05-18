package com.example.guysproject.repository;

import com.example.guysproject.entity.PartnerType;
import com.example.guysproject.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PartnerTypeRepository extends JpaRepository<PartnerType, UUID> {
}
