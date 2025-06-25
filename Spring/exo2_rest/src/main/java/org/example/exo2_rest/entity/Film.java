package org.example.exo2_rest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo2_rest.dto.film.FilmResponseDto;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Film {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFilm;

private String nom;
private LocalDate dateSortie;
private String description;

private String duree;
private String genre;

@ManyToOne
@JoinColumn(name = "realisateur_id")
private Realisateur realisateur;


public FilmResponseDto entityToDto(){
    return FilmResponseDto.builder()
            .idFilm(getIdFilm())
            .nom(getNom())
            .dateSortie(getDateSortie())
            .duree(getDuree())
            .genre(getGenre())
            .realisateur(getRealisateur().entityToDto())
            .build();
}
}
