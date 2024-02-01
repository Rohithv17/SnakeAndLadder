package com.bridgelabz.SnakeAndLadder;
import java.util.Random;
public class PlayerMoves {

    public int pos=0;  //refers to  current position of player

   public void compute(){
        Random rn= new Random();
        int rolldie= rn.nextInt(6);   //Generates a random number between 1-6 which can used to calculate player moves
        System.out.println(rolldie);


    }
}
