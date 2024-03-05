package tn.esprit.ski.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.ski.entities.Abonnement;
import tn.esprit.ski.entities.Piste;

import java.util.List;

public interface IPisteRepository extends CrudRepository<Piste, Long> {

}
