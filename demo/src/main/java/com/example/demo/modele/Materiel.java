package com.example.demo.modele;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerateValue;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="Materiel")
@Getter
@Setter
@NoArgsConstructor

public class Materiel {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)

    private String nom;
    @Column(length = 150)

    private String description;
    @Column(length = 550)

    private String marque;
    @Column(length = 550)

    private String image;
    @Column(length = 550)

    private Boolean taille;
    @Column(length = 550)

    private Integer duree_location;
    @Column(length = 550)

    private Float cout_location;
    @Column(length = 550)

    private Float cout_remplacement;
}
