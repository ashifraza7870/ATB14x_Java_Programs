package ex_08_IF_Cond;

import java.util.Scanner;

public class Lab025_If {
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enetr the number");
        int age  = s.nextInt();

        if (age>18){
            System.out.println("Yes you can vote");
        }
        else{
            System.out.println("You can't vote");
        }
    }
}
