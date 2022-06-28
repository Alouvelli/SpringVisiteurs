package sn.isi.springvisiteurs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.springvisiteurs.entities.Connaissance;

public interface ConnaissanceRepository extends JpaRepository<Connaissance, Long> {
}
