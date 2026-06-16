package com.tutorial;
// (this.name) always access atribute name in a class
// if not there also access atribute from (super.class)
// (super.name) always access atribute from (super.class)
public class HeroStrength extends Hero{
    String name = "Class Strength";

    void display(){
        System.out.println("Ini adalah " + this.name);
        this.dummyMethod();
    }

    void displaySuper(){
        System.out.println("Ini adalah " + super.name);
        super.dummyMethod();
    }

        void dummyMethod(){
        System.out.println("Method ini ada di subclass");
    }
}