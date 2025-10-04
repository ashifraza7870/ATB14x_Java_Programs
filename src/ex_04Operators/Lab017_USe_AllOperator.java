package ex_04Operators;

public class Lab017_USe_AllOperator {
    public static void main (String[] args){
        int a=10;
        int b=20;

        //.......................Relational operator.................................
        System.out.println(a+b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //........................Compound operator...................................
        int age =10;
        int age1=20;
        age +=10;      // age=age+10
        age1 -=20;
        System.out.println(age);
        System.out.println(age1);
    }
}
