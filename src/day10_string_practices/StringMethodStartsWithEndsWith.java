package day10_string_practices;

public class StringMethodStartsWithEndsWith {

    public static void main(String[] args) {

        String url = "www.amazon.com";

        boolean r1 = url.startsWith("www.");// first characters
        System.out.println(r1);

        boolean r2 = url.endsWith(".com");  // last characters
        System.out.println(r2);




    }
}
