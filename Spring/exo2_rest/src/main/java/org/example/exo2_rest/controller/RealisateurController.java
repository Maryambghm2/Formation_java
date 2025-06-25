package org.example.exo2_rest.controller;

import org.example.exo2_rest.dto.realisateur.RealisateurReceiveDto;
import org.example.exo2_rest.dto.realisateur.RealisateurResponseDto;
import org.example.exo2_rest.service.RealisateurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("catalogue")
public class RealisateurController {
    private RealisateurService realisateurService;

    @GetMapping("realisateurs")
    public ResponseEntity<List<RealisateurResponseDto>> getAll() {
        return ResponseEntity.ok(realisateurService.getAll());
    }

    @GetMapping("realisateur/{id}")
    public ResponseEntity<RealisateurResponseDto> getById(@PathVariable int id) {
        return ResponseEntity.ok(realisateurService.getById(id));
    }

    @PostMapping("realisateurs")
    public ResponseEntity<RealisateurResponseDto> create(@RequestBody RealisateurReceiveDto realisateur) {
        return ResponseEntity.status(HttpStatus.CREATED).body(realisateurService.create(realisateur));
    }


    @PutMapping("realisateur/{id}")
    public ResponseEntity<RealisateurResponseDto> update(@PathVariable int id, @RequestBody RealisateurReceiveDto realisateur) {
        return ResponseEntity.ok(realisateurService.update(id, realisateur));
    }

    @DeleteMapping("realisateur/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        realisateurService.delete(id);
        return ResponseEntity.ok(String.format("Realisateur at id : %s deleted", id));
    }

}
