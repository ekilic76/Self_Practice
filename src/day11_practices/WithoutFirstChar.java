package day11_practices;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
/*
Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String firstWord = scan.next();

        System.out.println("Enter your second word:");
        String secondWord = scan.next();

        scan.close();

        String result = firstWord.substring(1)+secondWord.substring(1);

        System.out.println(result);
 */
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word: ");
        String firstWord = input.next();

        System.out.println("Enter your second word: ");
        String secondWord = input.next();

        String result = firstWord.substring(1) + secondWord.substring(1);
        System.out.println(result);

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word");
        String firstWord = input.next();

        System.out.println("Enter your second word");
        String secondWord = input.next();

        String result = firstWord.substring(1) + secondWord.substring(1);

        System.out.println(result);



    }
}
/*

5. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */