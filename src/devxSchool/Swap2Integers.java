package devxSchool;

import java.util.Scanner;

public class Swap2Integers {
    public static void main(String[] args) {
        /*
        Write a program called Swap2Integers that prompts user for two integers.
        The program shall read the inputs as int, save in two variables called number1 and number2;
         swap the contents of the two variables; and print the results. For examples,

        Enter first integer: 9
        Enter second integer: -9
        After the swap, first integer is: -9, second integer is: 9
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second integer: ");
        int number2 = sc.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.printf("After the swap, first integer is: %s, second integer is: %s", number1, number2);

    }
}
