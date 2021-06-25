package day04myhw2_18printtablepow;


public class Day04Myhw2_18printTablePow {


    public static void main(String[] args) {
        final int MAX_A = 5;
        
        System.out.println("a    b   pow(a, b)");
        for (int i = 0; i < MAX_A; i++) {
        int a = i + 1;
        int b = a + 1;
        double powerResult = Math.pow(a, b);
            System.out.printf("%d    %d   %.0f\n", a, b, powerResult);
        }
    }
    
}
