import java.util.Arrays;
import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = Integer.parseInt(scanner.nextLine());
        double[] array = new double[len];

        for(int i = 0; i < array.length; i++)
            array[i] = Math.random()*10;

        double min = array[0];
        for(double num : array){
            if(num < min) min = num;
        }

        double max = array[0];
        for(double num : array){
            if(num > max) max = num;
        }

        double sum = 0.0;
        for(double num : array) sum += num;
        double average = sum/array.length;

        System.out.println("Your array is: " + Arrays.toString(array));
        System.out.println("Min value = " + min);
        System.out.println("Max value = " + max);
        System.out.println("Average = " + average);
    }
}
