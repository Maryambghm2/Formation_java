package org.example.tp_rest.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_rest.dto.observation.ObservationResponseDto;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Observation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_observation")
    private long idObservation;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "specie_id_specie")
    private Specie specie;

    @NotNull
    @Column(name = "observer_name")
    private String observerName;

    @NotNull
    private String location;

    @NotNull
    private double latitude;

    @NotNull
    private double longitude;

    @Column(name = "observation_date")
    private LocalDate observationDate;


    private String comment;

    @OneToMany(mappedBy = "observation", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Travellog> travellogs;

    public ObservationResponseDto entityToDto() {
        return ObservationResponseDto.builder()
                .idObservation(getIdObservation())
                .specieId(getSpecie().getIdSpecie())
                .observerName(getObserverName())
                .location(getLocation())
                .latitude(getLatitude())
                .longitude(getLongitude())
                .observationDate(getObservationDate())
                .comment(getComment())
                .build();
    }
}
