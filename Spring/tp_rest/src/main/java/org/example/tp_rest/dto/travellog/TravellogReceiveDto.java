package org.example.tp_rest.dto.travellog;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_rest.entity.Observation;
import org.example.tp_rest.entity.Travellog;
import org.example.tp_rest.entity.enums.TravelMode;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TravellogReceiveDto {

    private long observationId;

    private double distanceKm;

    private TravelMode mode;



    private Travellog dtoToEntity(Observation observation, double estimatedCo2Kg) {
 Travellog travellog = Travellog.builder()
                .observation(observation)
                .distanceKm(getDistanceKm())
                .mode(getMode())
                .build();

        travellog.calculateCO2();
        return travellog;
    }
}
