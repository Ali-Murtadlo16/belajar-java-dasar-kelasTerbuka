package com.tutorial;

public class IntelHero extends Hero {
    IntelHero(String name, double health){
        super(name, health);
    }

    public void display(){
        System.out.println(this.name + " Have More " + this.getHealth());
    }

}