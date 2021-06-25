package day04myhw2_23int2char;

import java.util.Scanner;

public class Day04Myhw2_23int2char {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int charInt = input.nextInt();
        
        if (charInt < 0 || charInt > 127) {
            System.out.println("Error: character must be 0-127 value");
            System.exit(1);
        }
        System.out.println("The character is " + (char)charInt);
    }
}