package com.tutorial;

public class Hero {
     // Atribute
    String name;
    double attackPower, health;

    // Constructor
    Hero(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    void attack(Hero enemy){
        System.out.println(this.name + " Attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }

    void takeDamage(double damage){
        System.out.println(this.name + " Receive damage " + damage);
        this.health = this.health - damage;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Power : " + this.attackPower);
    }
}
