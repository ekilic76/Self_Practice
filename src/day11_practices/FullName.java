package day11_practices;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name: ");

        String firstName = input.next().toLowerCase();

        firstName = (""+firstName.charAt(0)).toUpperCase()+ firstName.substring(1);

        System.out.println("Please enter your last name; ");

        String lastName = input.next().toLowerCase();
        lastName = ("" + lastName.charAt(0)).toUpperCase() + lastName.substring(1);

        System.out.println(firstName + " " +lastName);




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