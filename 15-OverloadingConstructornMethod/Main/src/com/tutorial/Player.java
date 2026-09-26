package com.tutorial;

public class Player {
    private String name;
    private static int jumlahPlayer = 0;

    Player(String name) {
        Player.jumlahPlayer++;
        this.name = name;
    }
    Player(){
        Player.jumlahPlayer++;
        this.name = "player" + Player.jumlahPlayer;
    }

    void show() {
        System.out.println("Name: " + this.name);
    }
}
