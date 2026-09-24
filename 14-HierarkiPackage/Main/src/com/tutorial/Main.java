package com.tutorial;
// Import Console class
import com.terminal.Console;
import static com.terminal.Console.log;
// Can't be private
class Main{
    public static void main(String[] args){
        Player player1 = new Player("Ahmad");
        Player player2 = new Player("Ali");
        Player player3 = new Player("Murtadlo");
        Player player4 = new Player("Asadillah");
        player1.show();
        player2.show();
        player3.show();
        player4.show();

        Console.log("\nMenampilkan data dengan console log");
        Console.log(player1.getName());
        Console.log(player2.getName());
        Console.log(player3.getName());
        Console.log(player4.getName());

        log("\nMenampilkan data dengan log saja");
        log(player1.getName());
        log(player2.getName());
        log(player3.getName());
        log(player4.getName());
    }
}
