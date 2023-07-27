/*Write a Java application that allows the user to enter up to 20 integer grades into an array. Stop
the loop by typing in ‐1. Your main method should call an Average method that returns the
average of the grades. Use the DecimalFormat class to format the average to 2 decimal places.*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradesAverage {
    public static void main(String[] args) {
        int[] grades = new int[20];
        int gradeCount = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter up to 20 integer grades.\n Enter -1 to stop.");

        while (gradeCount < 20) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();

            if (grade == -1) {
                break;
            }

            grades[gradeCount] = grade;
            gradeCount++;
        }

        DecimalFormat df = new DecimalFormat("0.00");
        double average = getAverage(grades,gradeCount);
        System.out.println("The average grade is: " + df.format(average));
    }

    private static double getAverage(int[] grades, int gradeCount) {
        float total = 0;
        for (int i = 0; i < gradeCount; i++) {
            total += grades[i];
        }
        return total / gradeCount;
    }

}
