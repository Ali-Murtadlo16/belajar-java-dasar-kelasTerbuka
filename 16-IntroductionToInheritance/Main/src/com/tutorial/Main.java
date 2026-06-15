package com.tutorial;
// Inheritance
// Super class, parent class, base class
class Hero{
    String name;

    void display(){
        System.out.println("Name : " + this.name);
    }
}
// Sub class, child class, derived class
class HeroStrength extends Hero{

}
class HeroIntelligent extends Hero{

}
public class Main{
    public static void main(String[] args){
        Hero hero1 = new Hero();
        hero1.name = "Ali";
        hero1.display();
        
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Murtadlo";
        hero2.display();
        
        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Asadillah";
        hero3.display();
        }
}