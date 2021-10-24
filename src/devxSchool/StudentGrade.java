package devxSchool;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        /*
        This program calculates the grade of a student based on the marks entered by user in each subject.
        Program prints the grade based on this logic.
        If the average of marks is >= 80 then prints Grade ‘A’
        If the average is <80 and >=60 then prints Grade ‘B’
        If the average is <60 and >=40 then prints Grade ‘C’
        else prints Grade ‘D
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Algebra grade:");
        int g1 = sc.nextInt();
        System.out.println("Enter Geometry grade:");
        int g2 = sc.nextInt();
        System.out.println("Enter Physics grade:");
        int g3 = sc.nextInt();

        int averGrade = Math.round((g1 + g2 + g3) / 3);

        if (averGrade >= 80)
            System.out.println("Grade 'A'");
        else if (averGrade >= 60 && averGrade < 80)
            System.out.println("Grade 'B'");
        else if (averGrade >= 40 && averGrade < 60)
            System.out.println("Grade 'C'");
        else System.out.println("Grade 'D'");


    }
}
