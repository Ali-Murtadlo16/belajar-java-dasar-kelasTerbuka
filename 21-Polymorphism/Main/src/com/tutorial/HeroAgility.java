package com.tutorial;

public class HeroAgility extends Hero{
    String type = "Agility";

    public HeroAgility(String name){
        super(name);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Type \t:\t" + this.type);
    }

    void showoff(){
        System.out.println("Im an Agility Hero ");
    }
}
