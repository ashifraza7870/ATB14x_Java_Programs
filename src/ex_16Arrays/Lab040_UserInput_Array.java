package ex_16Arrays;

import java.util.Scanner;

public class Lab040_UserInput_Array {
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = s.nextInt();

        String[] number_marks = new String[size];

        for (int i = 0; i < number_marks.length; i++) {
            System.out.println("Enter the element " + i);
            number_marks[i] = s.next();
        }

    }
}
