package com.example.guysproject;

import com.example.guysproject.service.SaleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GuysProjectApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(GuysProjectApplication.class , args);
        SaleService bean = run.getBean(SaleService.class);
    }
}
