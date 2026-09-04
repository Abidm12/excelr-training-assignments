package java_assignments.Day3;

/*
3) Read two integers and, using only the ternary (?:) operator, store and print
the larger of the two. Do not use an if statement.
*/

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int larger = (num1 > num2) ? num1 : num2;

        System.out.println("Larger number: " + larger);
    }
}
