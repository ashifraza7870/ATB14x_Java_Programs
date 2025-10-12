package ex_07_Inc_Dec_Operator;

public class Lab022_PostInc {
    public static void main (String[] args) {
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        // int a =10;
        //int b = a++ mean 10 bcz here is post inc so the value is same here but ig goes on next line then value is change to 11.
        //int b = 10
        //sout = a =11, bcz after line 6 value is increased due to post increment
    }
}
