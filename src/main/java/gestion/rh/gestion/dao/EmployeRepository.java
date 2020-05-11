package gestion.rh.gestion.dao;

import gestion.rh.gestion.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
