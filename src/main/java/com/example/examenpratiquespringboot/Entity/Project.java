package com.example.examenpratiquespringboot.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String title;
    private  String description;


  //  @ManyToMany(mappedBy = "Project")
    @ManyToMany
    private List<User> users ;

    @OneToMany( mappedBy = "project",cascade = CascadeType.ALL )
    @JsonIgnore
    private List<Sprint> sprints ;





}
