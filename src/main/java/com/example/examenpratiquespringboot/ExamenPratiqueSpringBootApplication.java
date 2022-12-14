package com.example.examenpratiquespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExamenPratiqueSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenPratiqueSpringBootApplication.class, args);
    }

}
