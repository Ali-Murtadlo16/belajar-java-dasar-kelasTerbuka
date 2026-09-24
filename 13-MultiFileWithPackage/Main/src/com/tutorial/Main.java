package com.tutorial;
import com.terminal.Console;
class Main {
    public static void main(String[] args){
        Player player1 = new Player("Ahmad", "Bandung");
        Player player2 = new Player("Ali", "Jakarta");
        Player player3 = new Player("Murtadlo", "Surabaya");
        Player player4 = new Player("Asadillah", "Bandung");
        player1.show();
        player2.show();
        player3.show();
        player4.show();

        Console.log("Hello ");
        Console.log("World ");
    }
}
