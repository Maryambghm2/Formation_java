package org.example.tp_rest.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_rest.dto.specie.SpecieResponseDto;
import org.example.tp_rest.entity.enums.Category;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "species")
public class Specie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_specie")
    private long idSpecie;

    @NotNull
    @Column(name = "common_name")
    private String commonName;

    @NotNull
    @Column(name = "scientific_name")
    private String scientificName;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Category category;

    @OneToMany(mappedBy = "specie", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Observation> observations;


    public SpecieResponseDto entityToDto(){
        return SpecieResponseDto.builder()
                .idSpecie(getIdSpecie())
                .commonName(getCommonName())
                .scientificName(getScientificName())
                .category(getCategory())
                .build();
    }
}
