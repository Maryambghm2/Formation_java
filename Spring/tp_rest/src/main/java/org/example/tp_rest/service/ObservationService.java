package org.example.tp_rest.service;

import org.example.tp_rest.dto.observation.ObservationReceiveDto;
import org.example.tp_rest.dto.observation.ObservationResponseDto;
import org.example.tp_rest.entity.Observation;
import org.example.tp_rest.entity.Specie;
import org.example.tp_rest.exception.NotFoundException;
import org.example.tp_rest.repository.ObservationRepository;
import org.example.tp_rest.repository.SpecieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObservationService {

    private final ObservationRepository observationRepository;
    private final SpecieRepository specieRepository;

    public ObservationService(ObservationRepository observationRepository, SpecieRepository specieRepository) {
        this.observationRepository = observationRepository;
        this.specieRepository = specieRepository;
    }

    public ObservationResponseDto create(ObservationReceiveDto observation) {
        //Specie specie = specieRepository.findById(observation.getSpecie()).orElseThrow(NotFoundException::new);

        //  Observation entity = observation.dtoToEntity(specie);

        return observationRepository.save(observation.dtoToEntity(specieRepository)).entityToDto();
    }

    public List<ObservationResponseDto> getAll() {
        return observationRepository.findAll().stream().map(Observation::entityToDto).toList();
    }

    public ObservationResponseDto getById(long id) {
        return observationRepository.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public List<ObservationResponseDto> findBySpecie(long id) {
        return observationRepository.findByIdSpecie(id).stream().map(Observation::entityToDto).toList();
    }

    public List<ObservationResponseDto> findByLocation(String location) {
        return observationRepository.findByLocation(location).stream().map(Observation::entityToDto).toList();
    }

}
