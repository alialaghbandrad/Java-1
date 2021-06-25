package day03myfriendsloop;

import java.util.Scanner;

public class Day03MyFriendsLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        {
            String name;
            int count = 0;
            while (true) {
                System.out.print("Enter friend's name, empty to finish: ");
                name = input.nextLine();
                if (name.isEmpty()) {
                    break;
                }
                System.out.printf("%s is your friend\n", name);
                count++;
            }
        String plural = count == 1 ? "" : "s";
        System.out.printf("You have %d friend%s\n", count, plural);
        }   
}    
}
