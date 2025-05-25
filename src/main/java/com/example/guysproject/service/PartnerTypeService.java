package com.example.guysproject.service;

import com.example.guysproject.entity.PartnerType;
import com.example.guysproject.repository.PartnerTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PartnerTypeService {
    private final PartnerTypeRepository repository;

    public PartnerType createPartner(String name){
        System.out.println("hello world");
        return repository.save(PartnerType.builder().name(name).build());
    }
}
