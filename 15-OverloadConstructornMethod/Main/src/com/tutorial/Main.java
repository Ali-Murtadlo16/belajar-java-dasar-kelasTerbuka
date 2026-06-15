package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Overloading at Constructor
        Player player1 = new Player("Ahmad");
        Player player2 = new Player("Ali");
        Player player3 = new Player("Murtadlo");
        Player player4 = new Player();

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // Overloading Method
        int a = Math.tambah(26, 99);
        System.out.println(a);
        double b = Math.tambah(26, 99);
        System.out.println(b);
    }
}
