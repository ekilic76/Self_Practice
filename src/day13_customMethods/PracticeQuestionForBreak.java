package day13_customMethods;

public class PracticeQuestionForBreak {

    public static void main(String[] args) {

        System.out.println(isOdd(22));
        System.out.println(isOdd(21));

        System.out.println(isEven(22));
        System.out.println(isEven(41));

        System.out.println(isEven2(55));
        System.out.println(isEven2(60));

        System.out.println(max(22, 88));
        System.out.println(max(39, 9));

        System.out.println(min(30, 8));
        System.out.println(min(22, 98));


        int num = 200;

        if (isEven(num)){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }

    }

    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        }
        return false;

    }

    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
    public static boolean isEven2(int number){
        return !isOdd(number);
    }
    public static int max(int number1, int number2){
        if (number1> number2){
            return number1;
        }else{
            return number2;
        }
    }

    public static int min(int number1, int number2){
        if (number1<number2){
            return number1;
        }else {
            return number2;
        }
    }


}

/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */
