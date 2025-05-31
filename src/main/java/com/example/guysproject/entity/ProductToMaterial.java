package com.example.guysproject.entity;

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
@Table(name = "product_material")
public class ProductToMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID code;

    @ManyToOne
    private Material material;
    @ManyToOne
    private Product product;

    public void setMaterial(Material material) {
        this.material = material;
        this.material.getProductToMaterial().add(this);
    }

    public void setProduct(Product product) {
        this.product = product;
        this.product.getProductToMaterial().add(this);
    }
}
