package day12_customMethods;

public class CustomMethodWithParameter {

    public static void main(String[] args) {

        oddOrEven(30);
        oddOrEven(1001);
        System.out.println("-------------------------");
        isEligibleToBuyAlcohol(21);
        isEligibleToBuyAlcohol(17);
        System.out.println("-------------------------");
        evenOddOrZero(21);
        evenOddOrZero(30);
        evenOddOrZero(-22);
        evenOddOrZero(0);


    }


    // this method takes and argument number, and verifies if the number is even or odd number
    public static void oddOrEven(int number) { // this method takes and argument number, and verifies if the number is even or odd number
        if (number % 2 == 0) {
            System.out.println(number + " is Even number.");
        } else {
            System.out.println((number + " is odd number"));
        }

    }

    public static void isEligibleToBuyAlcohol(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are not eligible to buy alcohol");
        }
    }

    public static void evenOddOrZero(int number) {
        if (number  == 0) {
            System.out.println(number + " is zero");
        } else if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number ");
        }
    }

    public static void studentsGrade(int score){
        if (score >= 90){
            System.out.println("your grade is A");
        } else if (score>= 80) {
            System.out.println("Your grade is B");
        }
    }
}


