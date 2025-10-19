package ex_10_ForLoop;

import java.util.Random;
import java.util.Scanner;

public class Lab031_While_GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();            // random is class who generate randon number
        int numberToGuess = random.nextInt(100);
       //System.out.println(numberToGuess);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts =0;

        while (true){
            if(!s.hasNextInt()){
                System.out.println("Invalid Input! Please enter integer value");
                s.next();
                continue;
            }
            guess = s.nextInt();
            attempts++;

            if(guess <1 || guess > 100){
                System.out.println("Please Enter number between 1 to 100");
                continue;
            }
            if(guess < numberToGuess){
                System.out.println("Guess number is too low, Try again.....");
            }
            else if (guess > numberToGuess) {
                System.out.println("Guess number is too high, Try again.....");
            }
            else {
                System.out.println("Correct! You guessed it in " +attempts + " attempts");
                break;
            }

            }
        }

    }

