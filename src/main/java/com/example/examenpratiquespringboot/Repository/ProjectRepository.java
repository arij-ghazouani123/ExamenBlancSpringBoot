package com.example.examenpratiquespringboot.Repository;

import com.example.examenpratiquespringboot.Entity.Project;
import com.example.examenpratiquespringboot.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    void assignProjectToClient(Integer projectId, String firstName , String lastName);
}
