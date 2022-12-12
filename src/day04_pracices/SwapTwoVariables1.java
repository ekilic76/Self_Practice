package day04_pracices;

public class SwapTwoVariables1 {
    public static void main(String[] args) {

        int x = 10,
                y = 15;
        int z = x;

        x = y;
        y = z  ;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


      /*
        int x = 10,
                y = 15;
        int z = x;
        x = y;
        y = z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

       */


    }
}
/*
Create a class named SwapTwoVariables1 and declare the following variables:
            x
            y
            z
            Write a program that swap variables x & y values by using a temporary variable z
        Ex:
              x = 10
              y = 15
        output:
                  x = 15
                  y = 20
 */