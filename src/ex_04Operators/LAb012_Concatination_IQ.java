package ex_04Operators;

public class LAb012_Concatination_IQ {
    public static void main (String[] args){
        String firs_name ="Ashif";
        String last_name ="Raza";

        int a=10;
        int b=15;
        System.out.println(firs_name+last_name +a+b);   // Here firstly behave as a concatination so also behave the same on int

        System.out.println(a+b +firs_name+last_name);   // But in reverse case like if int value adding firstly then on string is not adding it act as a concatination

        System.out.println(last_name+firs_name + (a+b)); // Here its adding int value according to bodmas principle
    }
}
