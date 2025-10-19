package ex_10_ForLoop;

import java.util.Scanner;

public class Lab029_Factorial {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number for factorial");
        int n = s.nextInt();
        int fact=1;
        if(n==0){
            fact=1;
        }
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
