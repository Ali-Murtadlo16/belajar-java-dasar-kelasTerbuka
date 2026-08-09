package com.tutorial;

import com.hero.HeroAgility;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        HeroAgility hero1 = new HeroAgility("Ali", 100);
        hero1.displayAll();

        // Access Modifier
        hero1.nickname = "\nSembarang";
        hero1.displayAll();

        // Reflection
        Class<?> classHero1 = hero1.getClass();
        Class<?> parentClassHero1 = hero1.getClass().getSuperclass();
        System.out.println("\nClass : " + classHero1.getName());
        System.out.println("\nparent : " + parentClassHero1.getName());

        // Object Check
        System.out.println("\nAttribute From Object hero1");
        Field[] hero1Fields = classHero1.getFields();
        System.out.println("Attribute is: " + hero1Fields.length);
        System.out.println("Attribute: " + hero1Fields[0].getName());

        // Attribute Check All Hero Object
        System.out.println("\nAttribute All Of Hero1");
        Field[] hero1AllFields = classHero1.getDeclaredFields();
        System.out.println("Attribute is: " + hero1AllFields.length);
        System.out.println("Attribute: ");
        for (Field field : hero1AllFields) {
            System.out.println(field.getName());
        }

        // Attribute Check All Hero Object
        System.out.println("\nAttribute All Of SuperClass Hero  ");
        Field[] hero1AllFieldsBaru = parentClassHero1.getDeclaredFields();
        System.out.println("Attribute is: " + hero1AllFieldsBaru.length);
        System.out.println("Attribute: ");
        for (Field field : hero1AllFieldsBaru) {
            System.out.println(field.getName());
        }

        // Change score with refleection
        System.out.println("\nChange score with refleection");
        System.out.println("\nBefore change: ");
        hero1.display();
        System.out.println("\nAfter change: ");
        // Change public method
        hero1AllFields[0].set(hero1, "Ali");
        // Change private method
        hero1AllFields[1].setAccessible(true);
        hero1AllFields[1].set(hero1, "Intel");
        hero1.heroType = "strength";
        // Change SuperClass
        hero1AllFields[0].setAccessible(true);
        hero1AllFields[0].set(hero1, "Murtadlo");
        hero1AllFields[1].setAccessible(true);
        hero1AllFields[1].set(hero1, "Asadillah");
        hero1.display();
    }
}
