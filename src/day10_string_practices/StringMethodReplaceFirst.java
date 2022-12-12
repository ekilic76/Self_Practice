package day10_string_practices;

public class StringMethodReplaceFirst {

    public static void main(String[] args) {


        String str = "Python is cool, I love Python Programming";

        str = str.replaceFirst("Python","Java"); // will only replace the first python. not both

        System.out.println(str);

    }
}
