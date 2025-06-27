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

    private double distanceKm;

    private TravelMode mode;



    public Travellog dtoToEntity() {
 Travellog travellog = Travellog.builder()
                .distanceKm(getDistanceKm())
                .mode(getMode())
                .build();

        travellog.calculateCO2();
        return travellog;
    }
}
