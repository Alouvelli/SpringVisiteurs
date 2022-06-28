package sn.isi.springvisiteurs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.springvisiteurs.entities.Visiteur;


public interface VisiteurRepository extends JpaRepository<Visiteur, Long> {

}
