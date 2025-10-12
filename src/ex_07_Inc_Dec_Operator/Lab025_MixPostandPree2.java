package ex_07_Inc_Dec_Operator;

public class Lab025_MixPostandPree2 {
    public static void main (String[] args){
        int a=10;
        System.out.println(++a + ++a);
        System.out.println(a);

        //++a is 11 and agian ++a is due to pre inc
        //First ++a is 11 and sec ++a is 12
        //So 11+12 = 23
        //NEw value of a is 12
        //So output is 23 and 12


    }
}
