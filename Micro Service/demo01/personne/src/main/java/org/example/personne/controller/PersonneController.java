package org.example.personne.controller;


import org.example.personne.model.Adresse;
import org.example.personne.model.Personne;
import org.example.personne.util.RestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/personne")
public class PersonneController {

    private final RestTemplate restTemplate = new RestTemplate();


    @GetMapping("/{id}")
    public Personne getPersonne(@PathVariable int id) {
        Personne personne = new Personne();
        personne.setId(id);
        personne.setName("Toto");
        Adresse adresse = restTemplate.getForObject(
                "http://localhost:8080/adresse/{id}",
                Adresse.class,
                id
        );
        personne.setAdresse(adresse);
        return personne;
    }

    @GetMapping("/detail/{id}")
    public Personne getPeople(@PathVariable int id) {
        Personne personne = new Personne();
        personne.setId(id);
        personne.setName("Tata");
        RestClient<Adresse> adresseRestClient = new RestClient<>("http://localhost:8080/adresse/7");
        Adresse adresse = adresseRestClient.get(Adresse.class);
        personne.setAdresse(adresse);
        return personne;
    }
}
