package com.tutorial;
// Import Console class
import com.terminal.Console;
import static com.terminal.Console.log;
// Can't be private
class Main{
    public static void main(String[] args){
        Player player1 = new Player("Ali");
        player1.show();

        Console.log("\nMenampilkan data dengan console log");
        Console.log(player1.getName());
        
        log("\nMenampilkan data dengan log saja");
        log(player1.getName());
    }
}