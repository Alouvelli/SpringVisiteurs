package sn.isi.springvisiteurs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.springvisiteurs.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Long> {
}
