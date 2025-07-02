package org.example.adresse.controller;


import org.example.adresse.model.Adresse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adresse")
public class AdresseController {

    @GetMapping("/{id}")
    public Adresse getCustomer(@PathVariable int id) {
        return new Adresse(id,"rue des pias",59200);
    }
}
