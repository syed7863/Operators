package syed;
import java.util.Scanner;

public class MarksValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's marks (0-100): ");
        int marks = scanner.nextInt();

        String grade;

        if (marks < 0 || marks > 100) {
            grade = "Invalid marks";
        } else if (marks >= 81 && marks <= 100) {
            grade = "Distinction";
        } else if (marks >= 60 && marks <= 80) {
            grade = "First Class";
        } else if (marks >= 49 && marks <= 59) {
            grade = "Second Class";
        } else if (marks >= 35 && marks <= 48) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}