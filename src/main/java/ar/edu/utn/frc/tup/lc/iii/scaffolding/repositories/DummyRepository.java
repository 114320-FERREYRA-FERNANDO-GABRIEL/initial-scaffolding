package ar.edu.utn.frc.tup.lc.iii.scaffolding.repositories;


import ar.edu.utn.frc.tup.lc.iii.scaffolding.entities.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity, Long> {
}
