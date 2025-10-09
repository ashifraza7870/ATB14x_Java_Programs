package ex_06Ternary_Operator;

import java.util.Scanner;

public class LAb019_OddEven {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enetr the number");
        int num = s.nextInt();

        if(num %2 == 0){
            System.out.println(num + " is even number");
        }
        else {
            System.out.println(num + " is odd number");
        }

    }
}
