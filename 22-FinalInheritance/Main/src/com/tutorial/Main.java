package com.tutorial;
public class Main{
    public static void main(String[] args){
        System.out.println("");

        Hero hero1 = new Hero("Ali", 100);
        IntelHero hero2 = new IntelHero("Murtadlo", 100);

        hero1.display();
        hero2.display();

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());
    }
}