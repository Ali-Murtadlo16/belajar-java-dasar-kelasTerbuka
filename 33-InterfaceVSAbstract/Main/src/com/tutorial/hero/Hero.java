package com.hero;

public class Hero {
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public void display(){
        System.out.println("Name: " + this.name + ", Health: " + this.health);
    }
}
