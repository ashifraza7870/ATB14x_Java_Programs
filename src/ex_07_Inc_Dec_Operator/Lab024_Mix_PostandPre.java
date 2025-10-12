package ex_07_Inc_Dec_Operator;

public class Lab024_Mix_PostandPre {
    public static void main (String[] args){
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // int a++ is 10 and ++a is 11 after post inc value change to ++a 12
        // and if add a++ 10 and ++a 12 = 22
        // and new value of a is 12
        // so output is 22 and 12

    }
}
