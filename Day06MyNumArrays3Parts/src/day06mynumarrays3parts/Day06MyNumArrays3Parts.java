package day06mynumarrays3parts;

import java.util.Scanner;

public class Day06MyNumArrays3Parts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] valsArray = new int[4];
            for (int i = 0; i < valsArray.length; i++) {
                System.out.print("Enter value: ");
                    int val = input.nextInt();
                    input.nextLine();
                    valsArray[i] = val;
            }
            for (int i = 0; i < valsArray.length; i++) {
                System.out.printf("Value #%d is %d\n", i + 1, valsArray[i]);
            }
            int sum = 0;
            int smallest = valsArray[0];
            for (int i = 0; i < valsArray.length; i++) {
                int val = valsArray[i];
                sum += val;
                if (val < smallest) {
                    smallest = val;
                }
            }
        System.out.printf("Sum is %d\n", sum);
        System.out.printf("Smallest number is %d\n", smallest);
        double ave = (double) sum / valsArray.length;
        System.out.printf("Average is %.2f\n", ave);
    }
    
}
