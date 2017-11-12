package com.example.user.zoomanagerhomework.Animals;

/**
 * Created by user on 12/11/2017.
 */
// animalClass referring in this homework to e.g.
// cats(lion)/primates(monkey)/largeMammal(elephant)

public class Elephant extends Animal {
    //discuss: add characteristics here or in elephant parameters?
    private String characteristics;

    public Elephant(String animalClass, String name, double value, String characteristics) {
        super(animalClass, name, value);

        //discuss: this.characteristics even needed here?
        this.characteristics = characteristics;
    }

    public String getCharacteristics() {
        return this.characteristics;
    }


}
