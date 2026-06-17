package com.tutorial;

public class HeroIntel extends Hero{
    String type = "Intel";

    public HeroIntel(String name){
        super(name);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type \t:\t" + this.type);
    }
}
