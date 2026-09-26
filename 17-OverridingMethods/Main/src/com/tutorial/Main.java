package com.tutorial;
public class Main{
    public static void main(String[] args){
    Hero hero1 = new Hero();
    hero1.name = "Ahmad";
    hero1.display();

    HeroStrength hero2 = new HeroStrength();
    hero2.name = "Ali";
    hero2.defencePower = 100;
    hero2.display();

    HeroIntelligent hero3 = new HeroIntelligent();
    hero3.name = "Murtadlo";
    hero3.intelligence = 100;
    hero3.display();
    }
}
