
package day06mynamearray;

import java.util.Scanner;

public class Day06MyNameArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] nameArray = new String[4];
        
        for (int i = 0; i < nameArray.length; i++) {
            System.out.print("Enter your friend's name: ");
            String name = input.nextLine();
            nameArray[i] = name;
        }
        for (int i = 1; i <= nameArray.length; i++) {
            System.out.printf("Friend #%d is %s\n", i, nameArray[i - 1]);
        }
    }
    
}
