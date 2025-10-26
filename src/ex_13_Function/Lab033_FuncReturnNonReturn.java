package ex_13_Function;

public class Lab033_FuncReturnNonReturn {
    public static void main(String[] args) {

        non_return_type_function();

        String name = return_string_type_function();
        System.out.println(name);
    }
    static void non_return_type_function(){
        System.out.println("Hi there, No return type function");
    }

    //Return type= which return data type (int, string, char, boolean, float)

    static String return_string_type_function(){
        System.out.println("Hi there, It will return something");
        return ("ashif");
    }

}
