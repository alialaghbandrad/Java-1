package day02hw3_6;

import java.util.Scanner;

public class Day02hw3_6 {

    public static void main(String[] args) {
        final int INCHES_IN_FOOT = 12; // constant
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        int lbs = input.nextInt();
        System.out.print("Enter feet: ");
        int feet = input.nextInt();
        System.out.print("Enter inches: ");
        int inches = input.nextInt();
        // TODO: verify inputs
        int inchesTotal = inches + feet*INCHES_IN_FOOT;
        double bmi = (double)lbs / ( inchesTotal * inchesTotal ) * 703;
        int bmiInt = (int) bmi; // cast
        System.out.printf("BMI is %.2f, as an int is %d\n", bmi, bmiInt);
        // interpret the result
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Healthy");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else { // 30 or above
            System.out.println("Obese");
        }
    }
    
} 
