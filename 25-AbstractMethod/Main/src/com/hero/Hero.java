package com.hero;

public abstract class Hero {
    public String name;
    private int level;

    public Hero(String name){
        this.name = name;
        this.level = 1;
    }

    public void display(){
        System.out.println("Aku Adalah " + this.name);
        System.out.println("Levelku " + this.level);
    }

    public abstract void levelUp();

    public void setLevel(int deltaLevel){
        this.level += deltaLevel;
    }
}
