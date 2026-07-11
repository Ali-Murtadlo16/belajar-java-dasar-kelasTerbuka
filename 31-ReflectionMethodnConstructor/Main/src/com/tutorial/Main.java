package com.tutorial;

import com.Hero.HeroAgility;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        HeroAgility hero = new HeroAgility("Ali ", 0);

        Method[] methods = hero.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if(method.getName().equals("setHeroType")){
                System.out.println("\nInvoke method setHeroType");
                method.setAccessible(true);
                method.invoke(hero, "Swordman");
            }

            if(method.getName().equals("setNickname")){
                System.out.println("\nInvoke method setNickname");
                method.setAccessible(true);
                method.invoke(hero, "Woodman");
            }
        }

        Field[] fields = hero.getClass().getSuperclass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Constructor<?>[] constructorHero = hero.getClass().getDeclaredConstructors();
        for (Constructor<?> constructor : constructorHero) {
            if(constructor.getName().equals("com.Hero.HeroAgility")){
                Object[] obj = {"Ali Baru", 100};
                constructor.setAccessible(true);
                Object newHero = constructor.newInstance(obj);
                System.out.println("Sukses instansiasi objek baru lewat Reflection!");
            }
        }
    }
}
