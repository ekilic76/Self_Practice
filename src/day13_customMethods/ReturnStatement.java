package day13_customMethods;

public class ReturnStatement {
    public static void main(String[] args) {

       int calc=  multiplication(21,87);

        System.out.println(calc);

        eligible(31);

        System.out.println("-----------------------------");

        System.out.println("Test started");
        boolean exit = true;
        if(exit){
            return;// return statement exit the method.

        }
        System.out.println("Test Completed");

    }

    public static void eligible(int age){
        if (age <0 || age>= 150){
            System.err.println("Invalid age: " + age);
            return;
        }

        if (age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }

    public static int multiplication(int n1, int n2){
        int result = n1 * n2;
        return result;
    }



}
