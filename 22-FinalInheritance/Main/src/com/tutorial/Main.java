package com.tutorial;
// Visibility
//1. if Method or Atribute in public explisite,
//    then subclass can't unable visibility
//2. if Method or Atribute in private explisite,
//    then subclass can't access too
//3. if Method or Atribute in final keyword is unactivate and be legacy,
public class Main{
    public static void main(String[] args){
        System.out.println("");

        Hero hero1 = new Hero("Ali", 100);
        IntelHero hero2 = new IntelHero("Murtadlo", 100);

        hero1.display();
        hero2.display();
        
        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());
        
        hero1.setHealth(50);
        hero2.setHealth(50);
        
        hero1.display();
        hero2.display();
    }
}