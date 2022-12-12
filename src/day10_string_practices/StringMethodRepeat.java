package day10_string_practices;

public class StringMethodRepeat {
    public static void main(String[] args) {

        String str = "Java";

        String result = str.repeat(4);

        String result1 = str.concat(" ").repeat(4); // you can also add space in between the repeats

        System.out.println(result);
        System.out.println(result1);





    }
}
