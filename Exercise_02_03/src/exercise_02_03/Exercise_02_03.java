package exercise_02_03;
/* (Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
*/

import java.util.Scanner;

public class Exercise_02_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet*0.305;
        // TODO: verify inputs
        // System.out.println(feet + " feet is " + meters + " meters");
        System.out.printf("%.3f feet it %.3f meters\n", feet, meters);
        
        //
        System.out.print("Enter a number in pounds: ");
        double lbs = input.nextDouble();
        double kgs = lbs*0.454;
        System.out.printf("%.3f pounds is %.3f kilograms\n", lbs, kgs);
    }
    
}
