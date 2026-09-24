package com.tutorial;

import java.awt.PageAttributes;

class Player{
    private String name;
    private String daerah;
    Player(String name, String daerah){
        this.name = name;
        this.daerah = daerah;
    }

    void show(){
        System.out.println("Player name : " + this.name);
        System.out.println("Player daerah : " + this.daerah);
    }
}
