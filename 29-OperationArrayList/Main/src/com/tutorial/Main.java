package com.tutorial;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ali", 100);
        Hero hero2 = new Hero("Murtadlo", 100);
        AgilityHero heroAgility = new AgilityHero("Dewi", 100);
        IntelHero heroIntel = new IntelHero("Sri", 100);

        ArrayList<Hero> listHero = new ArrayList<>();

        // Operation 1 : Add member
        System.out.println("Operation 1: Add");
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(heroAgility);
        
        System.out.println(listHero);
        System.out.println();
        
        // Operation 2 : Change member with set
        System.out.println("Operation 2: Set");
        listHero.set(2, heroIntel);
        System.out.println(listHero);
        System.out.println();
        
        // Operation 3 : Remove member
        System.out.println("Operation 3: Remove");
        listHero.remove(2);
        System.out.println(listHero);
        System.out.println();
        
        // Operation 4 : Access member
        System.out.println("Operation 4: Get");
        System.out.println(listHero);
        Hero getHero = listHero.get(0);
        getHero.display();
        System.out.println(listHero);
        System.out.println();
        
        // Method in Arraylist
        System.out.println("Method: ");
        System.out.println("1, size()\t: " + listHero.size());
        System.out.println("2, isEmpty()\t: " + listHero.isEmpty());
        System.out.println("3, contains(hero2)\t: " + listHero.contains(hero2));
        System.out.println("4, contains(heroAgility)\t: " + listHero.contains(heroAgility));
        System.out.println("5, indexOf(hero1)\t: " + listHero.indexOf(hero1));
        System.out.println("6, indexOf(heroAgility)\t: " + listHero.indexOf(heroAgility));

        hero1.display();
        hero2.display();
    }
}