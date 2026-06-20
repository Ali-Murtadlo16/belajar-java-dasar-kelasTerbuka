package com.hero;

public class HeroStrength extends Hero{
    public HeroStrength(String name){
        super(name);
    }

    public void display(){
        System.out.println("Hero " + this.name);
    }

    public void setName(String name){
        super.setName(name);
    }
}
