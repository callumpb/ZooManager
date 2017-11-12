package com.example.user.zoomanagerhomework.ZooEnclosures;

import com.example.user.zoomanagerhomework.Animals.Animal;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2017.
 */

public class Enclosure<T> extends Animal {
    private T type;
    //discuss: animals or animal?
    private ArrayList<Animal> animals;


    //discuss: ArrayList added in parameters?
    public Enclosure(String animalClass, String name, double value, ArrayList<Animal> animals) {
        super(animalClass, name, value);
        //discuss: will need to implement method to expose
        //animalClass/name/value from Animals.animal
        this.animalClass = animalClass;
        this.name = name;
        this.value = value;
        this.animals = new ArrayList<Animal>();
    }

    public T getType() {
        return this.type;
    }


    //methods to implement:
    //addAnimal, removeAnimal from Arraylist of animals

}
