package com.Hero;

public class Hero {
    private String name;
    private double health;

    Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void dispplay(){
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
    }
}
