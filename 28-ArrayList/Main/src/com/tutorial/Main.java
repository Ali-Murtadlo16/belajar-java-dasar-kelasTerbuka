package com.tutorial;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {

        Hero hero1 = new Hero("Ali",100);
        Hero hero2 = new Hero("Murtadlo", 100);
        AgilityHero agilityHero = new AgilityHero("Ahmad", 100);
        IntelHero intelHero = new IntelHero("Asadillah", 100);

        Hero[] kumpulanHeros = new Hero[3];
        kumpulanHeros[0] = hero1;
        kumpulanHeros[1] = hero2;
        kumpulanHeros[2] = agilityHero;
        // kumpulanHeros[3] = intelHero;

        for(Hero hero:kumpulanHeros){
            hero.display();
        }
        
        // ArrayList
        ArrayList<Hero> listHero = new ArrayList<Hero>();

        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(agilityHero);
        listHero.add(intelHero);

        System.out.println("\nArrayList\n");
        for(Hero hero:listHero){
            hero.display();
        }
        
        // References
        System.out.println("\nArrayList\n");
        agilityHero.setName("Adalah pokoknya ");
        for(Hero hero:listHero){
            hero.display();
        }
        
        System.out.println("\nArray\n");
        for(Hero hero:kumpulanHeros){
            hero.display();
        }
    }
}