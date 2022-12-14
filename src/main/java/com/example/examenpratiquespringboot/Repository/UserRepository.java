package com.example.examenpratiquespringboot.Repository;

import com.example.examenpratiquespringboot.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
