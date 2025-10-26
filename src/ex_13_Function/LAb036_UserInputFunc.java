package ex_13_Function;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LAb036_UserInputFunc {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = s.nextInt();

        System.out.println("Enter value of b");
        int b = s.nextInt();


        int result = sum_of_two_number(a,b);
        int result1 = multiply(a,b);
        sum_of_two_number();

        System.out.println(result);
        System.out.println(result1);


    }
    static int sum_of_two_number(int a, int b){
        return a+b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    static void sum_of_two_number(){
        System.out.println("Hi there");
    }
}
