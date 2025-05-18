package com.example.guysproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID code;
    @ManyToOne
    private Status status;
    @ManyToOne
    private DeliveryType deliveryType;
    private double realizationPrice;
    @ManyToOne
    private Partner partner;
    @Builder.Default
    @OneToMany(mappedBy = "sale")
    private List<SaleToProduct> saleToProduct = new ArrayList<>();
}