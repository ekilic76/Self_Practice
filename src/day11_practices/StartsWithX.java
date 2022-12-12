package day11_practices;

public class StartsWithX {

    public static void main(String[] args) {

        String a = "Tuzel";
        if (a.charAt(0)== 'T'){
            a = a.replaceFirst("T", "G");
        }
        System.out.println(a);
        System.out.println("-------------------------------------");

        String str = "xcodex";
        if(str.charAt(0)=='x'){
            str = str.replaceFirst("x", "a");
        }
        System.out.println(str);
        System.out.println("-------------------------------------");

        String b = "Java";
        if(b.charAt(0) == 'J'){
            b = b.replaceFirst("J", "K");
        }
        System.out.println(b);

        System.out.println("-------------------------------------");

        String school = "Cydeo";
        if(school.charAt(0) == 'C'){
            school = school.replaceFirst("C", "T");
        }
        System.out.println(school);


    }
}
/*
Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */