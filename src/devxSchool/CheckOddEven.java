package devxSchool;

public class CheckOddEven {
    public static void main(String[] args) {
        /*
        Write a program called CheckOddEven which prints
        "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
        The program shall always print “bye!” before exiting.
         */
        int number = 49;
        System.out.println("The number is " + number);

        if (number % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        System.out.println("bye!");


    }
}
