package com.bridgelabz.SnakeAndLadder;
import java.util.Random;
public class PlayerMoves {

    public int current_pos=0;  //refers to  current position of player


   public void chances() {


       for(int i=0;i<5;i++) { // let's take a sample of 5 tries
           Random rn = new Random();
           int rolldie = rn.nextInt(6);  // finds number obtained after rolling the die


           Random ch = new Random();
           int option = ch.nextInt(3);               //To generate options

           if (option == 1) {

               current_pos = current_pos - rolldie;  //option snake

           } else if (option == 2) {

               current_pos = current_pos + 10;   //option ladder

           } else {

                       current_pos=current_pos+0; //option skip
           }
       }
       System.out.println("The current position is : "+current_pos);

   }}