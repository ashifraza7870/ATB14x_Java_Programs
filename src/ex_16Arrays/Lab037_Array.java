package ex_16Arrays;

public class Lab037_Array {
    public static void main (String[] args){
        int marks[] = {85, 88, 95, 68, 73};
        boolean[] can_vote_After_18 = {true, false};

        System.out.println(marks.length);
        System.out.println(marks[1]);
        System.out.println(marks[4]);

        String name = "Ashif";
        String[] name_each_element_char = name.split( "");
        // ["A", "S", "H", "I", "F"]
        for(String s: name_each_element_char){
            System.out.println(s);
        }
    }
}
