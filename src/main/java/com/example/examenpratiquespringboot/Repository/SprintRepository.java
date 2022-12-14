package com.example.examenpratiquespringboot.Repository;

import com.example.examenpratiquespringboot.Entity.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository extends JpaRepository<Sprint, Integer> {
}
