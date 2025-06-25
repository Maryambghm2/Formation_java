package org.example.exo2_rest.dto.film;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo2_rest.entity.Film;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmReceiveDto {
    @NotBlank
    private String nom;

    @Pattern(regexp = "[0-9]{2}[-|\\/]{1}[0-9]{2}[-|\\/]{1}[0-9]{4}", message = "La date dois etre au format dd-MM-yyyy")
    private String dateSortieStr;
    private String description;
    private String duree;
    private String genre;
    private int realisateurId;



}




