package com.tutorial;
// Keyword import package extern
import com.terminal.Console;
class Main {
    public static void main(String[] args){
        Player player1 = new Player("Ali");
        Player player2 = new Player("Murtadlo");
        player1.show();
        player2.show();

        Console.log("Hello ");
        Console.log("World ");
    }    
}