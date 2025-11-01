package ex_16Arrays;

public class Lab038_For_Array {
    public static void main (String[] args){
        int marks[] = {87, 98, 56, 76, 54,56};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[3]);
        System.out.println(marks[5]);

        System.out.println("--------------");

        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("For each loop...............");

        for(int mark : marks){
            System.out.println(mark);
        }
    }
}
