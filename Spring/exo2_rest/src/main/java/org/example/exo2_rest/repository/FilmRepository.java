package org.example.exo2_rest.repository;

import org.example.exo2_rest.dto.film.FilmResponseDto;
import org.example.exo2_rest.dto.realisateur.RealisateurReceiveDto;
import org.example.exo2_rest.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query("select f from Film f where f.realisateur.idReal = ?1")
    List<Film> findByRealisateur(int idRealisateur);

    int id(int id);
}
