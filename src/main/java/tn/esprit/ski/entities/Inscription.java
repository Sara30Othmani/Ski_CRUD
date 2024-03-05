package tn.esprit.ski.entities;

import jakarta.persistence.*;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;
    private int numSemaine;

    @ManyToOne
    private Skieur skieur;

    @ManyToOne
    private Cours cours;

}
