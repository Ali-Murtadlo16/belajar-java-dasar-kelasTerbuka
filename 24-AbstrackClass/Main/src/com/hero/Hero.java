package com.hero;

public abstract class Hero {
    public String name;

    public Hero(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Aku Adalah " + this.name);
    }
}
