package org.example.exo2_rest.service;

import org.example.exo2_rest.dto.realisateur.RealisateurReceiveDto;
import org.example.exo2_rest.dto.realisateur.RealisateurResponseDto;
import org.example.exo2_rest.entity.Realisateur;
import org.example.exo2_rest.repository.RealisateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealisateurService {

    private RealisateurRepository realisateurRepository;

    public RealisateurResponseDto create(RealisateurReceiveDto realisateurReceiveDto) {
        return realisateurRepository.save(realisateurReceiveDto.dtoToEntity()).entityToDto();
    }

    public List<RealisateurResponseDto> getAll() {
        return realisateurRepository.findAll().stream().map(Realisateur::entityToDto).toList();
    }

    public RealisateurResponseDto getById(int id) {
        return realisateurRepository.findById(id).orElse(null).entityToDto();
    }

    public RealisateurResponseDto update(int id, RealisateurReceiveDto realisateurReceiveDto) {
        Realisateur found = realisateurRepository.findById(id).orElse(null);
        Realisateur realisateurReceive = realisateurReceiveDto.dtoToEntity();


        found.setNom(realisateurReceive.getNom());
        found.setPrenom(realisateurReceive.getPrenom());
        found.setDateNaissance(realisateurReceive.getDateNaissance());
        found.setNationalite(realisateurReceive.getNationalite());
        return realisateurRepository.save(found).entityToDto();
    }

    public boolean delete(int id) {
        realisateurRepository.deleteById(id);
        return true;
    }


}
