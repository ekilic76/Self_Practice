package day12_customMethods;

public class FormatFullName {
    public static void main(String[] args) {
        String first = "cYDEo";
        String last = "SCHOOL";

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        // getting the first character of first name and make it upperCase and the remaining characters of the first name
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase(); //getting the

        System.out.println(first);
        System.out.println(last);
        System.out.println(first + " " + last);

        String str1 = "erdal";
        String str2 = "kilic";

        str1 = str1.substring(0,1).toUpperCase() + str1.substring(1).toLowerCase();
        str2 = str2.substring(0).toUpperCase();
        System.out.println(str2 + ", " + str1);
        System.out.println(str1 + " " + str2);


        String s1 = "JAVA";
        String s2 = "PROgrammer";

        s1 = s1.substring(0, 2).toUpperCase() + s1.substring(2).toLowerCase();//I made half half :)
        s2 = s2.substring(0,6).toUpperCase() + s2.substring(6).toLowerCase();
        System.out.println(s1 + " " + s2);




    }
}
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";
	                    output:
	                        Cydeo School
 */