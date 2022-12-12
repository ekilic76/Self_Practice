package day10_string_practices;

public class StringMethodContains {
    public static void main(String[] args) {

        String str = "I love Java and Python programming language";

        boolean hasJava = str.contains("Java"); // returns boolean // case-sensitive
        boolean hasJava1 = str.toLowerCase().contains("java"); // you could use the toLowerCase method to not have the cas sensitivity


        System.out.println(hasJava);
        System.out.println(hasJava1);




    }
}
