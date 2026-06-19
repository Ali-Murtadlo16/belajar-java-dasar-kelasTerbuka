package com.tutorial;
public class Main{
    public static void main(String[] args) {
        // Casting
        double angka = 5.4;
        int angkaInt = (int) angka;
        System.out.println(angkaInt);
        
        // Hero Intel
        HeroIntel hero1 = new HeroIntel("Ali", 100);
        hero1.display();
        hero1.castMagic();

        // Up casting
        Hero heroUp = (Hero) hero1;
        heroUp.display();

        // Hero Agility
        Hero heroReg = new Hero("Murtadlo", 100);
        heroReg.display();

        // Flashback
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display();
    }
}