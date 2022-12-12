package day10_string_practices;



public class StringMethodsIsEmptyOrIsBlank {
    public static void main(String[] args) {

        String str = "     ";

        System.out.println(str.isEmpty());  // returns a boolean value. true if there is anything in the string
        // false if there is anything in the string even if there is only space.
        // you can use it with if statements also

        System.out.println(str.isBlank());// it will return a boolean value. if there is anything inside will return true
        // space without any character will return true




    }
}
