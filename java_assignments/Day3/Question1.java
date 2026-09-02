/*
1)Write a program that reads a four-digit integer from the user and prints the sum
of its digits (e.g., input 1234 should print 10). You must use only arithmetic
operators.
*/

package java_assignments.Day3;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        int num = sc.nextInt();

        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        int sum = d1 + d2 + d3 + d4;

        System.out.println(sum);
    }
}
