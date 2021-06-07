package com.patterns.builder;

import java.time.LocalDate;

public class Persona {
    private final String name;
    private final LocalDate birthday;
    private final float weight;
    

    private Persona(String name, LocalDate birthday, float weight) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public float getWeight() {
        return this.weight;
    }

    public static Builder builder() {
        return name -> birthday -> weight -> () -> new Persona(name, birthday, weight);
    }
    
    @FunctionalInterface
    public interface Builder {
        public Birthday name(String name);
    }

    @FunctionalInterface
    public interface Birthday {
        public Weight birthday(LocalDate birthday);
    }

    @FunctionalInterface
    public interface Weight {
        public Build weight(float weight);
    }

    @FunctionalInterface
    public interface Build {
        public Persona build();
    }
    
}
