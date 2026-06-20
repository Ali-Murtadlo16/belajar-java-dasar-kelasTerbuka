package com.tutorial;

import com.hero.HeroAgility;
import com.hero.HeroIntel;
import com.hero.HeroStrength;
public class Main{
    public static void main(String[] args){
        HeroIntel hero1 = new HeroIntel("Ali");
        hero1.display();
        
        HeroAgility hero2 = new HeroAgility("Murtadlo");
        hero2.display();
        
        hero1.levelUp();
        hero2.levelUp();
        hero1.display();
        hero2.display();
        
        HeroStrength hero3 = new HeroStrength("Asadillah");
        hero3.levelUp();
        hero3.display();
    }
}   