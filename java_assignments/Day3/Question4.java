 package java_assignments.Day3;

/*
4) Using Scanner, read a student's name (String), roll number (int), and CGPA
(double) in one program. Print a formatted line: "Roll - - CGPA".
*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println(name + " - " + rollNo + " - " + cgpa);
    }
}
