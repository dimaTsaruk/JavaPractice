package devxSchool;

import java.util.Scanner;

public class compareTwoNumb {
    public static void main(String[] args) {
        /*
        Write a Java program to compare two numbers.
        Input Data:
        Input first integer: 25
        Input second integer: 39
        Expected Output
        25 < 39 or  39 > 25    or  "The fist number is small"
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first integer: ");
        int n1 = sc.nextInt();
        System.out.println("Input first integer: ");
        int n2 = sc.nextInt();
        int small = 0, big = 0;
        String name = "";

        if (n1 > n2) {
            big = n1;
            small = n2;
            name = "second";
        } else {
            big = n2;
            small = n1;
            name = "first";
        }

        System.out.printf("%s < %s or %s > %s or The %s number is small",
                small, big, big, small, name);


    }
}
