package day10_string_practices;

public class StringMethodIndexOf {

    public static void main(String[] args) {

        String str = "Java Programming language";


        int index1 = str.indexOf("a"); // return the first character index number.

        int index2 = str.indexOf("a ");  // finds the second a
        int index3 = str.indexOf("amm");  // finds the 3rd a
        int index4 = str.indexOf("ang");  // finds the 4th a
        int index5 = str.indexOf("age");  // finds the 5th a on the string.


        System.out.println("index5 = " + index5);
        System.out.println("index4 = " + index4);
        System.out.println("index3 = " + index3);
        System.out.println("index2 = " + index2);
        System.out.println("index1 = " + index1);






    }


}
