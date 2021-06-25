package day04myhw3_4addgame;

import java.util.Random;
import java.util.Scanner;

public class Day04Myhw3_4addgame {

    public static void main(String[] args) {
        final int MAX_RAND = 100;
        Scanner input = new Scanner(System.in);
        
        Random random = new Random();
        int n1 = random.nextInt(MAX_RAND+1);
        int n2 = random.nextInt(MAX_RAND+1);
        System.out.printf("What is the sum of %d and %d? ", n1, n2);
        int sum = input.nextInt();
        if (sum == n1+n2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Invalid, the sum was " + (n1 + n2));
        }
        
    }
    
}
