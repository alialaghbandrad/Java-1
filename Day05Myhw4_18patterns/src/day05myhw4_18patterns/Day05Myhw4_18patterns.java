package day05myhw4_18patterns;

public class Day05Myhw4_18patterns {

    public static void main(String[] args) {
        final int HEIGHT = 6;
        System.out.println("Pattern A");
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
        System.out.println();
        }
        System.out.println("Pattern B");
        for (int i = HEIGHT; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
        System.out.println();
        }
        System.out.println("Pattern C");
        for (int i = 1; i <= HEIGHT; i++) {
            // print leading spaces first
            for (int j = 1; j <= HEIGHT-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        System.out.println("Pattern D");
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = 1; j < i; j++) {
                System.out.printf("  ");
            }
            for (int j = 1; j <= HEIGHT-i + 1; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
    
}
