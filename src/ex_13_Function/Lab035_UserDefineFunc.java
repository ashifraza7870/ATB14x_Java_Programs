package ex_13_Function;

public class Lab035_UserDefineFunc {
    public static void main (String[] args){
        int result = sum_of_two_number(3,4);
        int result1 = sum_of_two_number(10,15);
        sum_of_two_number();

        System.out.println(result);
        System.out.println(result1);


    }
    static int sum_of_two_number(int a, int b){
        return a+b;
    }
    static void sum_of_two_number(){
        System.out.println("Hi there");
    }
}
