package ex_04Operators;

public class Lab016_ORGate_IQ {
    public static void main (String[] args){
        int ashif_salary=12;
        boolean b = !(ashif_salary >10 || ashif_salary <5);
        System.out.println(b);

        //ashif_salary>10 = True
        //ashif_salary<5  = False
        //Answer is = Ture  (True+False= True)
        //Reverse of True is False, So the answer is False.
    }
}
