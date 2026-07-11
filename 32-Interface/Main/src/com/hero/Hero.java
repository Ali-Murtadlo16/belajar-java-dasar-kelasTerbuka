package com.hero;

public class Hero implements IAttack {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack(Hero enemy){
        System.out.println(this.name + " attacks " + enemy.name);
        enemy.health -= 10;
    }
    public void display() {
        System.out.println("Name: " + this.name + ", Health: " + this.health);
    }
}
