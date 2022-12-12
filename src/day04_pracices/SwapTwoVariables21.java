package day04_pracices;

import java.sql.SQLOutput;

public class SwapTwoVariables21 {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        x = x - y;
        y = x + y;
        x = y - x;
        y += y;
        System.out.println("x = " + x);
        System.out.println("y = " + y );

/*
        int first = 10;
        int second = 15;

        first = first - second;
        second = first + second;
        first = second - first;
        second += second;
        System.out.println("first = " + first);
        System.out.println("second = " + second);

 */


    }
}
/*
Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 20
 */