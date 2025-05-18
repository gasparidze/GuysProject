package com.example.guysproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "sale_product")
public class SaleToProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID code;

    @ManyToOne
//    @JoinColumn(name = "sale_uuid")
    private Sale sale;
    @ManyToOne
//    @JoinColumn(name = "product_id")
    private Product product;

    private Integer quantity;
}
