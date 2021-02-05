package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog(500,10);
        dog.DogInfo();

        Animal animal1 = new Animal();
        Cat cat = new Cat(200);
        cat.CatInfo();

    }
}
