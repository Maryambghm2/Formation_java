package org.example.tp_rest.dto.observation;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ObservationResponseDto {
    private long idObservation;

    private long specieId;

    private String observerName;

    private String location;

    private double latitude;

    private double longitude;

    private LocalDate observationDate;

    private String comment;

}
