package day13_customMethods;

import java.util.Scanner;

public class WarmUpTasks {
    public static void main(String[] args) {
    calculate(200, 5, '/');
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your two numbers and math operator");
        double n1 = input.nextDouble(),
                n2 = input.nextDouble();
        char operator = input.next().charAt(0);

        calculate(n1,n2,operator);

         */
        ageGroup(19);
        ageGroup(28);
        ageGroup(100);

        System.out.println("---------------------------------------");
        eligibleToVote(35, false);
        eligibleToVote(22,true);

    }

    public static void calculate(double num1,double num2, char mathOperator){

        double result = 0;
        switch (mathOperator){
            case '+': result = num1 + num2;
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
                break;
            case '-': result = num1 - num2;
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
                break;
            case '*': result = num1 * num2;
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
                break;
            case '/': result = num1 / num2;
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
                break;
            default:
                System.err.println("Invalid number");

        }


    }

    public static void ageGroup(int age){

        if (age >= 0 && age <= 150){
            System.out.println((age< 21)? "Teenager" : (age<55)? "Adult" : "Senior");
        }else {
            System.err.println("Invalid age");
        }







    }

    public static void eligibleToVote(int age, boolean isAmerican){
        if (age >= 18 && isAmerican){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are noy eligible to vote");
        }
    }





}
/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)
	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid
	     math operator, otherwise the method prints "Invalid Operator"
	        Ex:
	            calculate(10, 20, '+')
	        output:
	            10 + 20 = 30
	2. Create a method named ageGroup that can print the age group of the person
	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )
    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)
	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

 */