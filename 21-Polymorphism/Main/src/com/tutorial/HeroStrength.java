package com.tutorial;

public class HeroStrength extends Hero {
    String type = "Strength";

    public HeroStrength(String name){
        super(name);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Type \t:\t" + this.type);
    }
}
