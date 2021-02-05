package com.company;

public class Cat extends Animal {
    int run;

    public Cat(int run){
        this.run = run;
    }
    public void CatInfo(){
        System.out.println("Кот может пробежать " + run +" метров " + "но не умеет плавать");
    }
}
