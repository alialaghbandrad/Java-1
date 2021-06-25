package day.pkg03myswitchgrades;

import java.util.Scanner;

public class Day03MySwitchGrades {

    public static void main(String[] args) {
        // convert letter grade to GPA
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your letter grade: ");
        String letterGrade = input.nextLine();
        double gpa = 0;
        
        switch (letterGrade) {
            case "A":
                gpa = 4.0;
                break;
            case "A-":
                gpa = 3.7;
                break;
            case "B+":
                gpa = 3.3;
                break;
            case "B":
                gpa = 3;
                break;
            case "B-":
                gpa = 2.7;
                break;
            case "C+":
                gpa = 2.3;
                break;
            case "C":
                gpa = 2.0;
                break;
            case "C-":
                gpa = 1.7;
                break;
            case "D":
                gpa = 1;
                break;
            case "F":
                gpa = 0;
                break;
            default:
                System.out.println("Error: invalid grade " + letterGrade);
                System.exit(1);              
        }
    System.out.printf("GPA for %s is %.1f\n", letterGrade, gpa);
    }
    
}