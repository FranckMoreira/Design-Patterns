package com.patterns.builder;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(10, 12).build();

        System.out.println(nutritionFacts.getFat());

        Persona person = Persona.builder()
            .name("Flavia")
            .birthday(LocalDate.of(1994, 4, 23))
            .weight(56.6F)
            .build();

        System.out.println(person.getName() + " " + person.getBirthday().toString());
    }
}
