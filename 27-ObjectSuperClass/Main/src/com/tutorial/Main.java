package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ali");
        hero1.display();

        // Object is an a SuperClass
        Object hero2 = hero1;
        String str = hero2.toString();
        String str1 = hero1.toString();
        System.out.println(str);
        System.out.println(str1);

        // Method of ObjectClass
        System.out.println(hero1.equals(hero2));
        
        // Example from Equals
        Hero hero3 = new Hero("Ali");
        Hero hero4 = new Hero("Murtadlo");
        Hero hero5 = new Hero("Asadillah");
        Hero hero6 = new Hero("Ahmad");

        Jagoan hero7 = new Jagoan("Ali");

        System.out.println(hero2.equals(hero3));
        
        // Override Equals in Hero Class
        System.out.println(hero3.equals(hero1));
        System.out.println(hero3.equals(hero4));
        System.out.println(hero4.equals(hero5));
        System.out.println(hero5.equals(hero6));
        hero7.display();
    }
}