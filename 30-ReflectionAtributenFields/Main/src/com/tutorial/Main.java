package com.tutorial;

import com.hero.HeroAgility;
public class Main{
    public static void main(String[] args) {
        HeroAgility hero1 = new HeroAgility("Ali", 100);
        hero1.displayAll();
        
        // Access Modifier
        hero1.nickname = "Sembarang";
        hero1.displayAll();

        // Reflection
        
    }
}