package day08mytwodimarrays;

public class Day08MyTwoDimArrays {

    public static void main(String[] args) {
        int [][] data2D = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        for (int row = 0; row < data2D.length; row++) {
            for (int col = 0; col <data2D[row].length;col++) {
                int value = data2D[row][col];
                System.out.printf("%s%d", col == 0 ? "" : ", ", value);
            }
            System.out.println();
        }
        int sum = 0;
        int largest = data2D[0][0];
        int count = 0;
        for (int row = 0; row < data2D.length; row++) {
            for (int col = 0; col <data2D[row].length;col++) {
                int value = data2D[row][col];
                sum +=value;
                count++;
                if (value > largest){
                    largest = value;
                }
                    
            }
            
        }
    System.out.printf("Sum is %d, average is %.2f, largest value is %d", sum, (double)sum / count, largest);
    }
    
}
