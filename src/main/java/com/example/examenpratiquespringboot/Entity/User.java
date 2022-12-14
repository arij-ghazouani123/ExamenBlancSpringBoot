package com.example.examenpratiquespringboot.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String pwd;
    private String fName;
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany
    private List<Project> projects ;

    @ManyToMany(mappedBy = "users",fetch = FetchType.EAGER)
    @JsonIgnore
    private  List<Project> projectsList ;



}
