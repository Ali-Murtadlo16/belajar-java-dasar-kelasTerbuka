package com.tutorial;

public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ali");
        HeroStrength hero2 = new HeroStrength("Murtadlo");
        hero1.display();
        hero2.display();
        
        // Polymorphic
        Hero hero3 = new HeroAgility("Asadillah");
        hero3.display();
        HeroIntel hero4 = new HeroIntel("Ahmad");
        hero4.display();
        HeroAgility hero5 = new HeroAgility("Ahmad");
        hero5.showoff();
        
    
        // Array list
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4;

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();

        // Method Calls
        hero5.showoff();

        // Aplication
        hero1.attack(hero2);
        hero2.attack(hero3);
        hero3.attack(hero4);
    }
}