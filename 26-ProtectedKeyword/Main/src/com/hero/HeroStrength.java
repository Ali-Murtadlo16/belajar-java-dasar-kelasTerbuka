package com.hero;

public class HeroStrength extends Hero{
    public HeroStrength(String name){
        super(name);
    }

    @Override
    public void display(){
        System.out.println("Hero " + this.name);
    }

    @Override
    public void setName(String name){
        super.setName(name);
    }
}
