package com.tutorial;

//public class Hero extends Object{
public class Hero {
    private String name;

    public Hero(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("\nName " + this.name);
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){
            System.out.println("Same Object Yet ");
            return true;
        } else if (this.getClass() == otherObject.getClass()){
            System.out.println("Same Object Yet ");
            System.out.println("Other References ");

            Hero other = (Hero) otherObject;
            if (this.name == other.name){
                System.out.println("Same Name ");
                return true;
            } else {
                System.out.println("Other Name");
                return false;
            }
        } else {
            return false;
        }
    }
}
