package day04myhw3_16randchar;

public class Day04Myhw3_16RandChar {

    
    public static void main(String[] args) {
        // Similar to int val = random.nextInt(26) + 65
        int val = (int) (Math.random()*26 + 65);
        System.out.printf("Uppercase char: %c\n", (char) val);
    }
    
    /*         
    double b = (double)(Math.random()); -> generates a number 0-1
        System.out.println("b: " + b ); */
}
