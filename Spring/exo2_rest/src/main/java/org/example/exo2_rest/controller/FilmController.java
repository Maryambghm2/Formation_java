package org.example.exo2_rest.controller;

import org.example.exo2_rest.dto.film.FilmReceiveDto;
import org.example.exo2_rest.dto.film.FilmResponseDto;
import org.example.exo2_rest.entity.Film;
import org.example.exo2_rest.entity.Realisateur;
import org.example.exo2_rest.service.FilmService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("catalogue")
public class FilmController {
    private FilmService filmService;

    @GetMapping("films")
    public ResponseEntity<List<FilmResponseDto>> getAll() {
        return ResponseEntity.ok(filmService.getAll());
    }

    @GetMapping("film/{id}")
    public ResponseEntity<FilmResponseDto> getById(@PathVariable int id) {
        return ResponseEntity.ok(filmService.getById(id));
    }

    @PostMapping("films")
    public ResponseEntity<FilmResponseDto> create(@RequestBody FilmReceiveDto film) {
        return ResponseEntity.status(HttpStatus.CREATED).body(filmService.create(film));
    }

    @PutMapping("film/{id}")
    public ResponseEntity<FilmResponseDto> update(@PathVariable int id, @RequestBody FilmReceiveDto film) {
        return ResponseEntity.ok(filmService.update(id, film));
    }

    @DeleteMapping("film/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        filmService.delete(id);
        return ResponseEntity.ok(String.format("Film at id : %s deleted", id));
    }

    @GetMapping("film/realisateur/{id}")
public ResponseEntity<List<FilmResponseDto>> getByRealisateur(@PathVariable int id){
        return ResponseEntity.ok(filmService.getByDirector(id));
    }
}
