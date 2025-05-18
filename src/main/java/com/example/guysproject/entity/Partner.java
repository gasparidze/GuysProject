package com.example.guysproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "partner")
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID code;
    @ManyToOne
    private PartnerType partnerType;
    private String companyName;
    private String legalAddress;
    private String inn;
    private String directorFio;
    private String phone;
    private String email;
    private double rating;
    @ManyToOne
    private Staff manager;
    private double discount;
}
