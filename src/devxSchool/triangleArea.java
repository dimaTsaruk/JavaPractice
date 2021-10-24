package devxSchool;

import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        /*
        Please calculate the area of a triangle. The user should enter width and height of the right triangle.
        The formula is varied for different types of triangle, but the most common formula that was used as
        Area=(Height x Base) /2
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width: ");
        double w = sc.nextDouble();
        System.out.println("Enter height: ");
        double h = sc.nextDouble();

        double area = (h * w) / 2;
        System.out.printf("Area of triangle is: %s", area);


    }
}
