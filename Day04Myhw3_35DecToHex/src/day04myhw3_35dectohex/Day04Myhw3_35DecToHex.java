package day04myhw3_35dectohex;

import java.util.Scanner;

public class Day04Myhw3_35DecToHex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eneter a decimal value (0 to 15): ");
        int v = input.nextInt();
        if (v < 0 || v > 15) {
            System.out.print("Error: invalid input");
            System.exit(1);
        }
        char c;
            if (v < 10 ) {
                c = (char)('0' + v);
            } else {
                c = (char)('A' + v -10);
        }
            System.out.println("The hex value is " + c);
    }
    
}
