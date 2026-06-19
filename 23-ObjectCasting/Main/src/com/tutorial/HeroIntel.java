package com.tutorial;

public class HeroIntel extends Hero{
    public String type;
    public HeroIntel(String name, double Health){
        super(name, Health);
        this.type = "Intel";
    }

    @Override
    public void display(){
        System.out.println(this.getName() + " is a " + this.type + " Hero");
    }

    public void castMagic(){
        System.out.println("Magical ");
    }
}
