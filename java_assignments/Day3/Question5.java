package java_assignments.Day3;

/*
5) Read a temperature in Celsius as a double from the user and convert it to
Fahrenheit using F = (9/5) * C + 32. Print the result rounded to two decimal places.
*/

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f", fahrenheit);
    }
}
