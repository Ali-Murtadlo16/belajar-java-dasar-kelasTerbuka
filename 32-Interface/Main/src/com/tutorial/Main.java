package com.tutorial;
import com.hero.Hero;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ali", 100);
        Hero hero2 = new Hero("Budi", 100);

        hero1.attack(hero2);
        hero2.attack(hero1);
        hero1.display();
        hero2.display();
    }
}
