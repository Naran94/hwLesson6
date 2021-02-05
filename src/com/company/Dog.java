package com.company;

public class Dog extends Animal {
    int swim;

    public Dog(int run, int swim){
        this.swim = swim;
        this.run = run;
    }
    public void DogInfo(){
        System.out.println("Собака может пробежать " +run + " метров "+" и проплать " + swim +" метров ");
    }
}
