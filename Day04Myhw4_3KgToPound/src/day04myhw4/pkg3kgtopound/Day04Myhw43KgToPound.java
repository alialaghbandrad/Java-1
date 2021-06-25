package day04myhw4.pkg3kgtopound;

import java.util.Scanner;

public class Day04Myhw43KgToPound {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kilograms    pounds");
        for (int kgs = 1; kgs < 200; kgs += 2) {
        double pounds = 2.20462*kgs;
        System.out.printf("%-3d          %5.1f\n", kgs, pounds);
        
    }
    
}
}
