package org.example.tp_rest.service;

import org.example.tp_rest.dto.travellog.TravellogReceiveDto;
import org.example.tp_rest.dto.travellog.TravellogResponseDto;
import org.example.tp_rest.entity.Travellog;
import org.example.tp_rest.repository.TravellogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravellogService {

    private final TravellogRepository travellogRepository;

    public TravellogService(TravellogRepository travellogRepository) {
        this.travellogRepository = travellogRepository;
    }

    public List<TravellogResponseDto> getAll() {
        return travellogRepository.findAll().stream().map(Travellog::entityToDto).toList();
    }

    public TravellogResponseDto create(TravellogReceiveDto travellogReceiveDto) {

        Travellog toEntity = (travellogReceiveDto).dtoToEntity();
        //TravellogResponseDto toDto = toEntity.entityToDto();

        return travellogRepository.save(toEntity).entityToDto() ;
    }


}
