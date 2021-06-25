package day04myhw3_8sort3ints;

import java.util.Random;

public class Day04Myhw3_8Sort3Ints {

    public static void main(String[] args) {
        final int REPEAT = 20;
        Random random = new Random();
        for (int i = 0; i < REPEAT; i++) {
            int v1 = random.nextInt(10);
            int v2 = random.nextInt(10);
            int v3 = random.nextInt(10);
        
        
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
            System.out.println("");
    }
}
}
