package ex_10_ForLoop;

public class Lab028_IfElse {
    public static void main (String[] args){
        for(int age =0; age < 18; age++){
            if(age > 15){
                System.out.println("Eligible for vote");
            }
            else{
                System.out.println("Not Eligible");
            }
        }
    }
}
