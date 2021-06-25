package day02hw2_17windchill;

import java.util.Scanner;

public class Day02hw2_17WindChill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fah = input.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        double wind = input.nextDouble();
        // TODO: verify inputs
        double twc = 35.74 + 0.6215*fah - 35.75*Math.pow(wind, 0.16) + 0.4275*fah*Math.pow(wind, 0.16);
        System.out.printf("The wind chill index is %.1f\n", twc);
        System.out.println("The wind chill index is " + twc);
    }
    
}
