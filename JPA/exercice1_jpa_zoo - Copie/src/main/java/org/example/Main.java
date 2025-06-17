package org.example;

import org.example.entity.DietStatus;
import org.example.service.AnimalService;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnimalService service = new AnimalService();

        service.create("tutu", 15, LocalDate.now(), DietStatus.CARNIVORIOUS);
        service.create("titi", 18, LocalDate.now(), DietStatus.OMNIVORIOUS);
        service.create("tata", 5, LocalDate.now(), DietStatus.CARNIVORIOUS);
        service.create("toto", 30, LocalDate.now(), DietStatus.OMNIVORIOUS);
        service.create("tutu", 50, LocalDate.now(), DietStatus.HERBIVORIOUS);

    }
}