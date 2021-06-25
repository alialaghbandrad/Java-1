package day04myhw3_8sort3ints;

import java.util.Scanner;

public class Day04Myhw3_8Sort3Ints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int v1 = input.nextInt();
        System.out.print("Enter second number: ");
        int v2 = input.nextInt();
        System.out.print("Enter third number: ");
        int v3 = input.nextInt();
        // v1 v2 v3, v1 v3 v2, v2 v3 v1, v2 v1 v3, v3 v1 v2, v3 v2 v1
        if (v1 > v2) {
           if (v3 > v1) {
               System.out.printf("%d %d %d", v2, v1, v3);
           } else { //v3 < v1
               if (v2 > v3) {
                   System.out.printf("%d %d %d", v3, v2, v1);
               } else { // v2 < v3
               System.out.printf("%d %d %d", v2, v3, v1);
                }
            }
        } else { // v1 < v2
            if (v3 > v2) {
                System.out.printf("%d %d %d", v1, v2, v3);
            } else { // v3 < v2
                if (v1 > v3) {
                    System.out.printf("%d %d %d", v3, v1, v2);
                } else { //v1 < v3
                    System.out.printf("%d %d %d", v1, v3, v2);
                }
            }
        }
    }
}
