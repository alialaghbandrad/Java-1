package day02fpissues;

public class Day02FPIssues {

    public static void main(String[] args) {
        double value = 1.0d;
        System.out.println("Initial value: " + value);
        for (int i=0; i < 10; i++) {
            value -= 0.1;
            System.out.println("Value is: " + value);
        }
        System.out.println("Final result \" \\ is: " + value);
    }
    
}
