package org.example.exo2_rest.dto.film;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo2_rest.dto.realisateur.RealisateurResponseDto;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilmResponseDto {
    private int idFilm;
    private String nom;
    private LocalDate dateSortie;
    private String description;

    private String duree;
    private String genre;


    private RealisateurResponseDto realisateur;


}
