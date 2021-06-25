package day06mynumarrays3partswithmethods;

import java.util.Scanner;

public class Day06MyNumArrays3PartsWithMethods {
    
    static Scanner input = new Scanner(System.in);
    
    static int[] enterIntegers() { 
        int [] intsArray = new int[4];
        for (int i = 0; i < intsArray.length; i++) {
            System.out.print("Enter value: ");
            int val = input.nextInt();
            input.nextLine();
            intsArray[i] = val;
            }
        return intsArray;
    }
    
    static int findSmallestInteger(int [] intsArray) { 
            int minVal = intsArray[0];
            for (int i = 0; i < intsArray.length; i++) {
                int val = intsArray[i];
                if (val < minVal) {
                    minVal = val;
                }
            }
        return minVal;
    }
    
    static int getSumOfIntegers(int [] intsArray) { 
            int sum = 0;
            for (int i = 0; i < intsArray.length; i++) {
                int val = intsArray[i];
                sum += val;
            }
        return sum;    
    }
    
    static void printIntsArray(int [] intsArray) {
        for (int i = 0; i < intsArray.length; i++) {
        System.out.printf("Value #%d is %d\n", i + 1, intsArray[i]);
        }
    }
    public static void main(String[] args) {
    int [] valsArray = enterIntegers();
    printIntsArray(valsArray);
    int smallest = findSmallestInteger(valsArray);
    int total = getSumOfIntegers(valsArray);
    System.out.printf("Smalest is %d, total is %d, average is %.2f\n", 
            smallest, total, (double)total / valsArray.length);
        
    }

}

