package org.example.tp_rest.dto.observation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.tp_rest.entity.Observation;
import org.example.tp_rest.entity.Specie;
import org.example.tp_rest.exception.NotFoundException;
import org.example.tp_rest.repository.SpecieRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ObservationReceiveDto {

    private long specieId;
    private String observerName;
    private String location;
    private double latitude;
    private double longitude;

    private String observationDateStr;
    private String comment;


    public Observation dtoToEntity(SpecieRepository specieRepository) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return Observation.builder()
                .specie(specieRepository.findById(getSpecieId()).orElseThrow(NotFoundException::new))
                .observerName(getObserverName())
                .location(getLocation())
                .longitude(getLongitude())
                .latitude(getLatitude())
                .observationDate(LocalDate.parse(getObservationDateStr(), dateTimeFormatter))
                .comment(getComment())
                .build();
    }
}
