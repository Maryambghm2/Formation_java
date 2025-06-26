package org.example.tp_rest.dto.travellog;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_rest.entity.enums.TravelMode;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TravellogResponseDto {

    private long idTravellog;


    private long observationId;

    private double distanceKm;


    private TravelMode mode;


    private double estimatedCo2Kg;
}
