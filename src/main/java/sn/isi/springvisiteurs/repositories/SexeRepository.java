package sn.isi.springvisiteurs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.springvisiteurs.entities.Sexe;

public interface SexeRepository extends JpaRepository<Sexe, Long> {
}
