package java_assignments.Day3;

/*
6) Read a year and print whether it is a leap year. A year is a leap year if it is
divisible by 4, but not by 100, unless it is also divisible by 400.
*/

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
