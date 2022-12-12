package day10_string_practices;

public class StringMethodSubstring {
    public static void main(String[] args) {

        String str = "I love Java programming language";
        // index #    0123456789...

        String word1 = str.substring(7,10+1); // ending index is excluded. you need to add one (7,11)
        String word2 = str.substring(7); // it will start the index number you provided till the ending of the string


        System.out.println(word1);
        System.out.println(word2);


    }
}
