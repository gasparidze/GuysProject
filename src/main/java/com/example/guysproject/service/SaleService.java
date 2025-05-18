package com.example.guysproject.service;

import com.example.guysproject.entity.DeliveryType;
import com.example.guysproject.entity.Partner;
import com.example.guysproject.entity.Sale;
import com.example.guysproject.entity.Status;
import com.example.guysproject.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SaleService {
    private final SaleRepository repository;

    @Transactional
    public Sale createSale(Status status, DeliveryType deliveryType, Double realizationPrice, Partner partner){
        Sale newSale = Sale.builder()
                .status(status)
                .deliveryType(deliveryType)
                .realizationPrice(realizationPrice)
                .partner(partner)
                .build();

        return repository.save(newSale);
    }

    public Sale findByCode(UUID code){
        return repository.findById(code).orElse(null);
    }

    public List<Sale> findSaleByPartnerCode(UUID partnerCode){
        return repository.findAllByPartnerCode(partnerCode);
    }

    @Transactional
    public void deleteSaleByCode(UUID code){
        repository.deleteById(code);
    }
}
