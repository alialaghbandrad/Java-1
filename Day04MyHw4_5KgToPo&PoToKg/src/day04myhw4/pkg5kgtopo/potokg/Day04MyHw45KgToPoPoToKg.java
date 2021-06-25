package day04myhw4.pkg5kgtopo.potokg;

import java.util.Scanner;

public class Day04MyHw45KgToPoPoToKg {

    public static void main(String[] args) {

        System.out.println("Kilograms    pounds  |    Pounds     Kilograms");
        for (int i = 0, kgs = 1, lbs = 20; i < 100; i++, kgs += 2, lbs += 5) {

            System.out.printf("%-5d       %7.1f  |    %-5d      %8.2f\n", 
                    kgs, kgs * 2.20462, lbs, lbs * 0.453592);
        }
    }
}   

