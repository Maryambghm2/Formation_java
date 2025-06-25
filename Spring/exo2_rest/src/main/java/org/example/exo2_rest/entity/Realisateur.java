package org.example.exo2_rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo2_rest.dto.realisateur.RealisateurResponseDto;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Realisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReal;

    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String nationalite;

    public RealisateurResponseDto entityToDto() {
        return RealisateurResponseDto.builder()
                .idReal(getIdReal())
                .nom(getNom())
                .prenom(getPrenom())
                .dateNaissance(getDateNaissance())
                .nationalite(getNationalite())
                .build();
    }

}
