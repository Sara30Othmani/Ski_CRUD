package tn.esprit.ski.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int longueur;
    private int pente;

    @ManyToMany(mappedBy = "pistes")
    private Set<Skieur> skieurs;

}
