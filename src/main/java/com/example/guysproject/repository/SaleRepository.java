package com.example.guysproject.repository;

import com.example.guysproject.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SaleRepository extends JpaRepository<Sale, UUID> {
    List<Sale> findAllByPartnerCode(UUID code);
    void updateByCode(Sale sale, UUID code);

    @Modifying
    @Query(value = """
        UPDATE sale
        SET realization_price = :realizationPrice
        WHERE code = :code
    """, nativeQuery = true)
    void updateRealizationPriceByCode(UUID code, double realizationPrice);
}
