package org.example.exo2_rest.dto.realisateur;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RealisateurResponseDto {
    private int idReal;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String nationalite;
}

