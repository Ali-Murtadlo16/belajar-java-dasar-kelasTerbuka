package com.tutorial;

public class Hero {
    private String name;
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
        }

        // Getter
        public double getHealth(){
            return this.health;
        }

        // Getter
        public String getName(){
            return this.name;
        }

        // Setter
        public void setName(String name){
            this.name = name;
        }

        // Setter
        public void setHealth(double health){
            this.health = health;
        }

        // Primary Method
        public void display(){
            System.out.println(this.name + " Is a Regular Hero");
        }
}