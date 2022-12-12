package day04_pracices;

public class Circle {
    public static void main(String[] args) {

        int radius = 5;
        double pi = 3.14;
        double area = pi * (radius * radius);
        float perimeter = (float)(2 * pi * radius);

        System.out.println("Area of the circle is " + area);
        System.out.println("Perimeter of the circle is " + perimeter);

        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Area of the circle is " + area + "\nPerimeter of the circle is " + perimeter);


    }
}
/*
Create a class named Circle and declare the following variables:
                radius
                area
                perimeter
     Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5
            output:
                   Area of the circle is 78.5
                   Perimeter of the circle is 31.4
 */