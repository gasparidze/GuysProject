package com.example.guysproject.service;

import com.example.guysproject.entity.Partner;
import com.example.guysproject.entity.PartnerType;
import com.example.guysproject.entity.Staff;
import com.example.guysproject.repository.PartnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PartnerService {
    private final PartnerRepository repository;

    @Transactional
    public Partner savePartner(PartnerType partnerType,
                               String companyName,
                               String legalAddress,
                               String inn,
                               String directorFio,
                               String phone,
                               String email,
                               Double rating,
                               Staff manager,
                               Double discount){

        Partner newPartner = Partner.builder()
                .partnerType(partnerType)
                .companyName(companyName)
                .legalAddress(legalAddress)
                .inn(inn)
                .directorFio(directorFio)
                .phone(phone)
                .email(email)
                .rating(rating)
                .manager(manager)
                .discount(discount)
                .build();

        return repository.save(newPartner);
    }
}
