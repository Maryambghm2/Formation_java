package org.example.exo2_rest.dto.realisateur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo2_rest.entity.Realisateur;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RealisateurReceiveDto {
    @NotBlank
    private String nom;
    @NotBlank
    private String prenom;

    @Pattern(regexp = "\\d{2}[-/]{1}\\d{2}[-/]{1}\\d{4}", message = "La date doit être au format dd-MM-yyyy")
    private String dateNaissanceStr;

    private String nationalite;


    public Realisateur dtoToEntity(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return Realisateur.builder()
                .nom(getNom())
                .prenom(getPrenom())
                .dateNaissance(LocalDate.parse(getDateNaissanceStr(), dateTimeFormatter))
                .nationalite(getNationalite())
                .build();
    }
}
