package ex_16Arrays;

public class Lab39_Find_MAx_Number {
    public static void main (String[] args){
        int numbers[] = {44, 15, 54, 74, 65, 39};

        int max = numbers[0];
        for(int i =0; i<numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
