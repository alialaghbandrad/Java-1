package day02hw2_7minutestoyearsdays;

import java.util.Scanner;

import java.util.Scanner;

public class Day02hw2_7MinutesToyearsdays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        // TODO: verify inputs
        long days = minutes / 60 / 24; // same as 1440
        long years = days / 365;
        //long daysRemainder = days - 365*years;
        long daysRemainder = days % 365;
        System.out.printf("%d minutes is approximately %d years and %d days\n", 
                minutes, years, daysRemainder);
    }
    
}
