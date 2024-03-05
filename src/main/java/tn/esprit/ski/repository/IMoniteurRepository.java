package tn.esprit.ski.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.ski.entities.Abonnement;
import tn.esprit.ski.entities.Moniteur;

public interface IMoniteurRepository extends CrudRepository<Moniteur, Long> {
}
