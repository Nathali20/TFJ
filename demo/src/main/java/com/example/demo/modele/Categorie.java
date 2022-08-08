package com.example.demo.modele;


import jdk.jfr.Timestamp;

@Entity
@Table(name ="Categorie")
@Getter
@Setter
@NoArgsConstructor
public class Categorie {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)

    private String nom;
    @Column(length = 150)

    private Timestamp time;

}
