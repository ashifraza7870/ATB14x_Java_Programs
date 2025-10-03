package ex_02_Java_Basics;

public class Lab006PrintTableOf_9_UsePrintf {
    public static void main (String[] args){
        int table=9;
        for(int i=1; i<=10; i++){
            // System.out.printf("%d*i=%d ", table, table*i);
            System.out.println(table +"*" + i + "=" + (table*i));
        }
    }
}
