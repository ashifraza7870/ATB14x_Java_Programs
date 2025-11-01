package ex_16Arrays;

public class Lab041_SumofArray {
    public static void main (String[] args){
        int arr[] = {10, 5, 15, 20};

        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println("sum of array is " +sum);
    }
}
