package tn.esprit.ski.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;

    @ManyToMany
    private Set<Piste> pistes;

    @OneToMany(mappedBy = "skieur")
    private Set<Inscription> inscriptions;

    @OneToOne
    private Abonnement abonnement;
}
