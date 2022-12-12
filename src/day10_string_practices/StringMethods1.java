package day10_string_practices;

public class StringMethods1 {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        // index #    0123456789...
        char ch1 = str.charAt(5);
        System.out.println(ch1);

        int l = str.length();
        int last = str.length()-1; // last index number
        System.out.println(l);
        System.out.println(last);
        ;



    }
}
