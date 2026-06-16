package com.tutorial;
public class HeroStrength extends Hero{
    double defencePower;
    
    // Overriding Method
    void display(){
        System.out.println("\nHero Strength");
        System.out.println("Hero Name : " + this.name);
        System.out.println("Hero Name : " + this.defencePower);
    }
}