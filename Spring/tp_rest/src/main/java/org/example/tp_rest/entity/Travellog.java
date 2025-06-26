package org.example.tp_rest.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_rest.dto.travellog.TravellogResponseDto;
import org.example.tp_rest.entity.enums.TravelMode;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "travel_log")
public class Travellog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_travellog")
    private long idTravellog;


    @ManyToOne
    @JoinColumn(name = "observation_id_observation")
    private Observation observation;

    @NotNull
    @Column(name = "distance_km")
    private double distanceKm;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TravelMode mode;

    @NotNull
    @Column(name = "estimated_co2_kg")
    private double estimatedCo2Kg;

    public void calculateCO2() {
        estimatedCo2Kg = switch (mode) {
            case CAR -> distanceKm * 0.22;
            case BUS -> distanceKm * 0.11;
            case TRAIN -> distanceKm * 0.03;
            case PLANE -> distanceKm * 0.259;
            default -> 0.0;
        };

    }

    public TravellogResponseDto entityToDto() {
        return TravellogResponseDto.builder()
                .idTravellog(getIdTravellog())
                .observationId(getObservation().getIdObservation())
                .distanceKm(getDistanceKm())
                .mode(getMode())
                .estimatedCo2Kg(getEstimatedCo2Kg())
                .build();
    }
}
