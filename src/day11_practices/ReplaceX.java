package day11_practices;

public class ReplaceX {
    public static void main(String[] args) {

        String str = "xcodeX";

        str = str.replace('x', 'a').replace('X', 'a');

        System.out.println(str);

        System.out.println("-------------------------");

        String str1 = "Cydeo";

        str1 = str1.replace('C', 'T').replace('o', 'a');

        System.out.println(str1);

        System.out.println("-------------------------");

        String str2 = "Graham";
        str2 = str2.replace('r','t').replace('h', 'p').replace('m', 'n');
        System.out.println(str2);
        str2 = str2.replace('a', 'e');
        System.out.println(str2);



    }
}
/*
Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

 */