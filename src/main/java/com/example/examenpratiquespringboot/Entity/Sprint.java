package com.example.examenpratiquespringboot.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Sprint implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date startDate;



    @ManyToOne
    private Project project;
}
