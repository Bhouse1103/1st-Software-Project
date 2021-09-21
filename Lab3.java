package lab3;
//***************************************
//Brooklyn House
//CS232_001
//Lab3.java
//The purpose of this program is to basically run a guessing game. 
//The output will involve each guess, how close the guess was, and how many guesses it took.
//***************************************

import java.util.Scanner;

public class Lab3 {
   public static void main (String[] args){
       int i;
       
       i = (int) (Math.random() * 99 + 1);
       Scanner keyboard = new Scanner(System.in);
       
       int guess;
       int tries = 0;
       
       do {
           System.out.print("Enter a guess (1-100): ");
           guess = keyboard.nextInt();
           tries++;
           
           if (guess == i){
               System.out.println("Your guess is correct. Congratulations!");
               System.out.println("You guessed the number in " + tries + " guesses.");
           
           }else if (guess < i){
               System.out.println("Your guess is smaller than the secret number.");
               
           }else if (guess > i){
               System.out.println("Your guess is greater than the secret number.");
           }
       }while(i != guess);
       }
}
       
                  
                  
