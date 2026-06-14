package com.tutorial;
import java.util.ArrayList;

class Player{
    private static int numberOfPlayer;
    private static ArrayList<String> namelist = new ArrayList<String>();    
    private String name;

    Player(String name){
        this.name = name;
        Player.numberOfPlayer++;
        Player.namelist.add(this.name);
    }

    void show(){
        System.out.println("Player name: " + this.name);
    }
    
    // Static method
    static void showNumberOfPlayer(){
        System.out.println("Number Of Player : " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames(){
        return Player.namelist;
    }

}
class Main{
    public static void main(String[] args ){
        Player player1 = new Player("Ahmad");
        Player player2 = new Player("Ali");
        Player player3 = new Player("Murtadlo");
        Player player4 = new Player("Asadillah");

        Player.showNumberOfPlayer();

        System.out.println("Name = " + Player.getNames());
    }
}