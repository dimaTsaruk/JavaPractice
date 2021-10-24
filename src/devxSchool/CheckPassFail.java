package devxSchool;

public class CheckPassFail {
    public static void main(String[] args) {
        /*
        Write a program called CheckPassFail which prints "PASS"
        if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise.
        The program shall always print “DONE” before exiting.
         */

        int mark = 50;

        if (mark >= 50)
            System.out.println("Pass!");
        else
            System.out.println("Fail!");
        System.out.println("DONE");

    }
}
