package com.tutorial;

public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ali");
        HeroStrength hero2 = new HeroStrength("Murtadlo");
        hero1.display();
        hero2.display();

        // Polymorphic
        Hero hero3 = new HeroStrength("Asadillah");
        hero3.display();
    }
}