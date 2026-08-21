package com.tutorial;
import com.hero.HeroAgility;
import com.hero.HeroIntel;

public class Main {
    public static void main(String[] args) {
        HeroAgility hero1 = new HeroAgility("Ali", 100);
        HeroIntel hero2 = new HeroIntel("Murtadlo", 100);

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero2.spell(hero1);

        hero1.display();
        hero2.display();
    }
}
