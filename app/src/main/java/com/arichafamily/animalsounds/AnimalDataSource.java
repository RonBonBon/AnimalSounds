package com.arichafamily.animalsounds;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackeru on 29/05/2017.
 */

public class AnimalDataSource {
    public static List<Animal> getAnimals(){
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal(R.drawable.monkey, R.raw.monkey));
        animals.add(new Animal(R.drawable.bear, R.raw.bear));
        animals.add(new Animal(R.drawable.dog, R.raw.dog));
        animals.add(new Animal(R.drawable.dolphin, R.raw.dolphins));
        animals.add(new Animal(R.drawable.duck, R.raw.duck));
        animals.add(new Animal(R.drawable.eagle, R.raw.eaglet));
        animals.add(new Animal(R.drawable.bunnie, R.raw.rabbit));
        animals.add(new Animal(R.drawable.horse, R.raw.horse));

        return animals;
    }

}
