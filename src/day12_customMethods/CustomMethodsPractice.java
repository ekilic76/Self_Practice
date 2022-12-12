package day12_customMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        maxNum(21,99);
        maxNum(10.5, 20.3);
        System.out.println("-----------------------------");
        maxNum(15000, 16000);
        System.out.println("-----------------------------");
        maxNum(-200, -673);
        System.out.println("-----------------------------");
        initials("Erdal", "Kilic");
        initials("Ali", "Mansuroglu");
    }

    public static void maxNum(double num1, double num2){
        if (num1> num2){
            System.out.println(num1 + " is the maximum number");
        } else if (num2> num1) {
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println("equal");
        }
    }

    public static void initials(String firstName, String lastName){
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println("initial is " + initial);

    }





}
// Create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)
// Create a method that can display the initials of a person  (firstName, lastName)