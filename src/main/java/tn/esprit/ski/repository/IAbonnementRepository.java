package tn.esprit.ski.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.ski.entities.Abonnement;
import tn.esprit.ski.entities.TypeAbonnement;

import java.util.List;

public interface IAbonnementRepository extends CrudRepository<Abonnement, Long> {

    public List<Abonnement> findByTypeAbonAndPrixAbon(TypeAbonnement x, float y);
}
