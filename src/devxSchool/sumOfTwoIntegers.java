package devxSchool;

import java.util.Scanner;

public class sumOfTwoIntegers {
    public static void main(String[] args) {
        /*
         Write a Java program to calculate the sum of two integers and
         return true if the sum is equal to a third integer.
            Input the first number : 5
            Input the second number: 10
            Input the third number : 15
            The result is: true
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("1st integer?");
        int n1 = sc.nextInt();
        System.out.println("2nd integer?");
        int n2 = sc.nextInt();
        System.out.println("3rd integer?");
        int n3 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println("The result is: " + (sum == n3));


    }
}
