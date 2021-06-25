package day05myhw4_17pyramid;


public class Day05Myhw4_17Pyramid {

    public static void main(String[] args) {
        final int HEIGHT = 7;
        for (int i=1; i <= HEIGHT; i++) {
            for (int j = 1; j <= HEIGHT-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.printf("%d ", j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }    
    }
}
