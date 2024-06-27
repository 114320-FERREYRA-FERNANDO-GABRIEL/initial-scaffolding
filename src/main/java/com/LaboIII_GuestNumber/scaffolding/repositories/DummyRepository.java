package com.LaboIII_GuestNumber.scaffolding.repositories;

import com.LaboIII_GuestNumber.scaffolding.entities.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity, Long> {

}
