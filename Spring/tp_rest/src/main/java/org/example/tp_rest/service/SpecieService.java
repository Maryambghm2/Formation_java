package org.example.tp_rest.service;

import org.example.tp_rest.dto.specie.SpecieReceiveDto;
import org.example.tp_rest.dto.specie.SpecieResponseDto;
import org.example.tp_rest.entity.Specie;
import org.example.tp_rest.exception.NotFoundException;
import org.example.tp_rest.repository.SpecieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecieService {
    private final SpecieRepository repository;

    public SpecieService(SpecieRepository repository) {
        this.repository = repository;
    }


    public SpecieResponseDto create(SpecieReceiveDto specie) {
        return repository.save(specie.dtoToEntity()).entityToDto();
    }

    public List<SpecieResponseDto> getAll() {
        return repository.findAll().stream().map(Specie::entityToDto).toList();
    }


    public SpecieResponseDto getById(long id) {
        return repository.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public SpecieResponseDto update(long id, SpecieReceiveDto specieReceiveDto) {
        Specie specieFound = repository.findById(id).orElseThrow(NotFoundException::new);
        Specie specieGet = specieReceiveDto.dtoToEntity();

        specieFound.setCommonName(specieGet.getCommonName());
        specieFound.setScientificName(specieGet.getScientificName());
        specieFound.setCategory(specieGet.getCategory());

        return repository.save(specieFound).entityToDto();

    }

    public void delete(long id) {
        repository.deleteById(id);
    }

}
