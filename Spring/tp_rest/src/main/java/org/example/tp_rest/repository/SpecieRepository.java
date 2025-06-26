package org.example.tp_rest.repository;

import org.example.tp_rest.entity.Specie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecieRepository extends JpaRepository<Specie, Long> {
}
