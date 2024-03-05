package tn.esprit.ski.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.ski.entities.Abonnement;
import tn.esprit.ski.entities.Cours;

public interface ICoursRepository extends CrudRepository<Cours, Long> {
}
