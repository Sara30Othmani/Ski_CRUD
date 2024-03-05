package tn.esprit.ski.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;

    @OneToMany
    private List<Cours> cours;

    @OneToMany
    private Set<Cours> cours1;
}
