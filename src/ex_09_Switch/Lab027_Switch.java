package ex_09_Switch;

public class Lab027_Switch {
    public static void main (String[] args){
        int a=5;
        switch(a)
        {
            case 5:
                System.out.println("hi asif");
                break;
            case 10:
                System.out.println("hi raza");                     // o/p:- hi asif
                break;
            case 15:
                System.out.println("hi hashmi");
                break;
            default:
                System.out.println("hi xyz");
        }

    }
}
