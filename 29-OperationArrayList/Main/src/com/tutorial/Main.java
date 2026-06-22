package com.tutorial;
public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ali", 100);
        Hero hero2 = new Hero("Murtadlo", 100);

        hero1.display();
        hero2.display();
        System.out.println();
    }
}