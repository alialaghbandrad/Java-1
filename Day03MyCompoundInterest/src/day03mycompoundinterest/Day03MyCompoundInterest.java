package day03mycompoundinterest;

import java.util.Scanner;

public class Day03MyCompoundInterest {

    public static void main(String[] args) {
        /*
        final double YEARLY_RATE_PERC = 5.0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlyAmount = input.nextDouble();
        System.out.print("How many months will you be saving for? ");
        int months = input.nextInt();
        // TODO: verify inputs
        double monthlyMultRate = YEARLY_RATE_PERC / 12 / 100;
        double money = monthlyAmount;        
        for (int i = 0; i < months; i++) {
            System.out.printf("Amount of money at month %d is %.2f\n", i+1, money);
            money *= 1.0 + monthlyMultRate; // e.g. 2% monthly is 1.02
            money += monthlyAmount;
        }
        System.out.printf("In the end I have %.2f\n", money);
        */
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlyAmount = input.nextDouble();
        System.out.print("How many month will you be saving for? ");
        int months = input.nextInt();
        double monthlyInterest = 0.05/12;
        double money = monthlyAmount;
        for (int i = 0; i < months; i++) {
            System.out.printf("Amount of money at month %d is %.2f\n", i+1, money);
            money *= 1.0 + monthlyInterest;
            money += monthlyAmount;
        }    
        System.out.printf("In the end I have %.2f\n", money);
    }
    
}
