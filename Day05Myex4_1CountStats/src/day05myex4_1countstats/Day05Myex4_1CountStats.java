package day05myex4_1countstats;

import java.util.Scanner;

public class Day05Myex4_1CountStats {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int countPositive = 0;
        int countNegative = 0;
        while (true) {
            System.out.print("Enter an integer, 0 to end: ");
            int valueEntered = input.nextInt();
            if (valueEntered == 0) {
                break;
            }
            if (valueEntered > 0) {
                countPositive++;
            }
            if (valueEntered < 0) {
                countNegative++;
            }
            sum += valueEntered;
        }
        if ((countPositive + countNegative) == 0) {
            System.out.println("No number entered except 0");
            System.exit(0);
        }
        
        System.out.println("The number of positives is: " + countPositive);
        System.out.println("The number of negatives is: " + countNegative);
        System.out.println("The average is: " + (double) sum / (countPositive + countNegative));
    }
    
}
