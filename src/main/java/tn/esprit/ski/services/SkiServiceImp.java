package tn.esprit.ski.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ski.entities.Abonnement;
import tn.esprit.ski.entities.Cours;
import tn.esprit.ski.entities.Moniteur;
import tn.esprit.ski.entities.Piste;
import tn.esprit.ski.repository.IAbonnementRepository;
import tn.esprit.ski.repository.ICoursRepository;
import tn.esprit.ski.repository.IMoniteurRepository;
import tn.esprit.ski.repository.IPisteRepository;

@Service
public class SkiServiceImp implements ISkiService {
    @Autowired
    IAbonnementRepository abonnementRepo;

    @Autowired
    IPisteRepository pisteRepository;

    @Autowired
    ICoursRepository coursRepository;

    @Autowired
    IMoniteurRepository moniteurRepository;

    @Override
    public Abonnement addAbonnement(Abonnement a){
        return abonnementRepo.save(a);
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Iterable<Piste> retrieveAllPistes(){
        return pisteRepository.findAll();
    }

    @Override
    public Piste retrievePiste (Long numPiste){
        return pisteRepository.findById(numPiste).get();
    }
    @Override
    public Cours addCours(Cours cours){
        return coursRepository.save(cours);
    }


    @Override
    public Iterable<Cours> retrieveAllCours(){
        return coursRepository.findAll();
    }

    @Override
    public Cours retrieveCours(Long numCours){
        return coursRepository.findById(numCours).get();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur){
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Iterable<Moniteur> retrieveAllMoniteurs(){
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur){
        return moniteurRepository.findById(numMoniteur).get();
    }

}
