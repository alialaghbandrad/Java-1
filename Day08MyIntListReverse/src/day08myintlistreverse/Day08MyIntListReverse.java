package day08myintlistreverse;

import java.util.ArrayList;
import java.util.Scanner;
public class Day08MyIntListReverse {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        while (true) {
            System.out.print("Enter an integer, 0 to finish: ");
            int value = input.nextInt();
            if (value == 0) {
                break;
            }
            intList.add(value);
        }
        System.out.println("You entered:");
            for (int i = 0; i < intList.size(); i++) {
                int n = intList.get(i);
                System.out.println("n = " + n);
            }
        System.out.println("List in reverse:");
        for ( int i = intList.size() - 1; i >= 0; i--) {
            int n = intList.get(i);
            System.out.println("n = " + n);
        }
    }
    
}
