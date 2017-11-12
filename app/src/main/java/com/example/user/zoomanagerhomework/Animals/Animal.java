package com.example.user.zoomanagerhomework.Animals;

/**
 * Created by user on 12/11/2017.
 */

public abstract class Animal {

    private String animalClass;
    private String name;
    private double value;

    public Animal(String type, String name, double value) {
        this.animalClass = animalClass;
        this.name = name;
        this.value = value;
    }

    // to discuss: is it good idea to have type/name in this class?

    public String getAnimalClass() {
        return this.animalClass;
    }

    public String getName() {
        return this.name;
    }

    public double getValue() {
        return this.value;
    }
}
