package com.tutorial;

import com.tutorial.Player;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ahmad");
        Player player2 = new Player("Ali");
        Player player3 = new Player("Murtadlo");
        Player player4 = new Player("Asadillah");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        int a = Math.add(500, 600);
        System.out.println("a: " + a);
        double b = Math.add(500, 600.5);
        System.out.println("b: " + b);
    }
}
