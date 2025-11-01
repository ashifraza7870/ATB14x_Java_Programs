package ex_09_Switch;

import java.util.Scanner;

public class Lab026_Switch {
    public static void main (String[] args){

             //You need to take user input and ask for the integer from 1 to 7
            //And if user enters 1 to 7
           //You will tell which day it is.

            //Logic build
           // Step 1 - Number one is using the Scanner class.
          // Step 2 number two will be basically figuring out the expression and the day.
         // Step 3- We will basically add step 3 as a rough logic.
        // Step 4 - 4 is you will write the fix the logic and optimize.
       // Step 5 - figure out the edge cases.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7");

        if(s.hasNextInt()){                //hasNExtInt() check the given number is int or not
            int day = s.nextInt();
            switch (day){
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thr");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter int num from 1 to 7 only");
            }

        }

    }
}
