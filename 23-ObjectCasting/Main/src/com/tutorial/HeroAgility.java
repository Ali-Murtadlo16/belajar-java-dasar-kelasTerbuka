package com.tutorial;

public class HeroAgility extends Hero{
    String type;
    public HeroAgility(String name, double Health){
        super(name, Health);
        this.type = "Intel";
    }

    public void display(){
        System.out.println(this.getName() + " is a " + this.type + " Hero");
    }
}
