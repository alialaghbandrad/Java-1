package day03mynested;

import java.util.Scanner;

public class Day03MyNested {

    public static void main(String[] args) {
        // print out 0-99 lines, 10 numbers per line
        int n = 0;
        for (int i = 0; i < 10; i++) {
            //System.out.printf(" i=%d, i);
            for (int j = 0; j < 10; j++) {
                String separator = j == 9 ? "" : ", ";
                System.out.printf("%3d%s", n, separator);
                n++;
            }
            System.out.println("");
        }   
    }
}
