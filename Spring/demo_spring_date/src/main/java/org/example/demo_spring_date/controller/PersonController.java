package org.example.demo_spring_date.controller;

import org.example.demo_spring_date.entity.Person;
import org.example.demo_spring_date.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {
    private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping
    public String home(Model model) {
        model.addAttribute("persons", personService.getPersons());
        return "home";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("person", new Person());
        return "add";
    }

    @PostMapping("/add")
    public String addPerson(@ModelAttribute("person") Person person) {
        personService.save(person);
        return "redirect:/";
    }

}
