package org.example.exo2_rest.service;

import org.example.exo2_rest.dto.film.FilmReceiveDto;
import org.example.exo2_rest.dto.film.FilmResponseDto;
import org.example.exo2_rest.dto.realisateur.RealisateurResponseDto;
import org.example.exo2_rest.entity.Film;
import org.example.exo2_rest.repository.FilmRepository;
import org.example.exo2_rest.repository.RealisateurRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class FilmService {


    private FilmRepository filmRepository;
    private RealisateurRepository realisateurRepository;


    public FilmResponseDto create(FilmReceiveDto filmReceiveDto) {
        return filmRepository.save(dtoToEntity(filmReceiveDto)).entityToDto();
    }

    public FilmResponseDto getById(int id) {
        return filmRepository.findById(id).orElse(null).entityToDto();
    }

    public List<FilmResponseDto> getAll() {
        return filmRepository.findAll().stream().map(Film::entityToDto).toList();
    }

    public FilmResponseDto update(int id, FilmReceiveDto filmReceiveDto) {
        Film found = filmRepository.findById(id).orElse(null);
        Film filmReceive = dtoToEntity(filmReceiveDto);
        found.setNom(filmReceive.getNom());
        found.setDateSortie(filmReceive.getDateSortie());
        found.setDescription(filmReceive.getDescription());
        found.setDuree(filmReceive.getDuree());
        found.setGenre(filmReceive.getGenre());
        found.setRealisateur(filmReceive.getRealisateur());

        return filmRepository.save(found).entityToDto();
    }

    public boolean delete(int id) {
        filmRepository.deleteById(id);
        return true;
    }

//public List<FilmResponseDto> getFilmsByRealisateur(int idRealisateur){
//        return filmRepository.
//}

    public Film dtoToEntity(FilmReceiveDto filmReceiveDto) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return Film.builder()
                .nom(filmReceiveDto.getNom())
                .dateSortie(LocalDate.parse(filmReceiveDto.getDateSortieStr(), dateTimeFormatter))
                .description(filmReceiveDto.getDescription())
                .duree(filmReceiveDto.getDuree())
                .genre(filmReceiveDto.getGenre())
                .realisateur(realisateurRepository
                        .findById(filmReceiveDto
                                .getRealisateurId()).orElse(null))
                .build();
    }
}
