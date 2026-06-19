package com.tutorial;

public class Hero {
    public String name;
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    double getHealth(){
        return this.health;
    }
    
    final void setHealth(double newHealth){
        this.health = newHealth;
    }
    
    void setHealth(String mode){
        if(mode.equals("reset")){
            this.health = 100;
        }
    }
    
    public void display(){
        System.out.println(this.name + " Have " + this.health);
    }
}
