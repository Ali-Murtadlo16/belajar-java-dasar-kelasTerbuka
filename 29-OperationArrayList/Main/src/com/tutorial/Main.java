package com.tutorial;
public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ali", 100);
        Hero hero2 = new Hero("Murtadlo", 100);
        IntelHero hero3 = new IntelHero("Sri", 100);
        AgilityHero hero4 = new AgilityHero("Dewi", 100);

        hero1.display();
        hero2.display();
        System.out.println();

        hero3.display();
        hero4.display();
    }
}