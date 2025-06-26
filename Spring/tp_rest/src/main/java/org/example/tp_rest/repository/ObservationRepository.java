package org.example.tp_rest.repository;

import org.example.tp_rest.entity.Observation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ObservationRepository extends JpaRepository<Observation, Long> {

    //@Query("SELECT o from Observation o where o.location = ?1")
    List<Observation> findByLocation(String location);


   // @Query("SELECT o from Observation  o where  o.specie.idSpecie= ?1")
    List<Observation> findByIdSpecie(long specieId);
}
