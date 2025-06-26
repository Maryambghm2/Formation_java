package org.example.tp_rest.controller;

import org.example.tp_rest.dto.specie.SpecieReceiveDto;
import org.example.tp_rest.dto.specie.SpecieResponseDto;
import org.example.tp_rest.service.SpecieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("species")
public class SpecieController {

    private final SpecieService specieService;

    public SpecieController(SpecieService specieService) {
        this.specieService = specieService;
    }

    @GetMapping
    public ResponseEntity<List<SpecieResponseDto>> getAll() {
        return ResponseEntity.ok(specieService.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<SpecieResponseDto> getById(@PathVariable long id) {
        return ResponseEntity.ok(specieService.getById(id));
    }

    @PostMapping
    public ResponseEntity<SpecieResponseDto> create(@RequestBody SpecieReceiveDto specieReceiveDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(specieService.create(specieReceiveDto));
    }

    @PutMapping("{id}")
    public ResponseEntity<SpecieResponseDto> update(@PathVariable long id, @RequestBody SpecieReceiveDto specieReceiveDto) {
        return ResponseEntity.ok(specieService.update(id, specieReceiveDto));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        specieService.delete(id);
        return ResponseEntity.ok(String.format("Produit avec l'id : %s delete", id));

    }

}