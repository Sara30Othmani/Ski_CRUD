package tn.esprit.ski.services;

import tn.esprit.ski.entities.Abonnement;
import tn.esprit.ski.entities.Cours;
import tn.esprit.ski.entities.Moniteur;
import tn.esprit.ski.entities.Piste;

public interface ISkiService {
    public Abonnement addAbonnement(Abonnement a);

    public Piste addPiste(Piste piste);

    public Piste updatePiste(Piste piste);

    public Iterable<Piste> retrieveAllPistes();

    public Piste retrievePiste (Long numPiste);

    public Cours addCours(Cours cours);

    public Cours updateCours(Cours cours);

    public Iterable<Cours> retrieveAllCours();

    public Cours retrieveCours (Long numCours);

    public Moniteur addMoniteur(Moniteur moniteur);

    public Moniteur updateMoniteur(Moniteur moniteur);

    public Iterable<Moniteur> retrieveAllMoniteurs();

    public Moniteur retrieveMoniteur (Long numMoniteur);

}
