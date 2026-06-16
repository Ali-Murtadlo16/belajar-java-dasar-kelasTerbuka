package com.tutorial;
class Hero{
    // Atribute
    String name;
    double defencePower;
    // Constructor
    Hero(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    // Method
    void display(){
        System.out.println("Name : " + this.name);
    }
}
// SubClass
class HeroStrength extends Hero{
    // Constructor
    HeroStrength(String name, double defencePower){
        super(name, defencePower); 
    }
    
}
public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ali", 10);
        hero1.display();
        
        HeroStrength hero2 = new HeroStrength("Murtadlo", 10);
        hero2.display();
        
        HeroStrength hero3 = new HeroStrength("Asadillah", 10);
        hero3.display();
    }
}