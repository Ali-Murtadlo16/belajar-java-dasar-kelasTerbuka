package com.tutorial;
public class HeroIntelligent extends Hero{
    int intelligence;

    void display(){
        System.out.println("\nHero Intelligent");
        System.out.println("Hero Name : " + this.name);
        System.out.println("Hero Intelligence : " + this.intelligence);
    }

    void displaySuper(){
        System.out.println("Super Class : " + super.name);
        super.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("Method ini ada di sub.class");
    }
}
