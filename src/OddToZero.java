import java.util.Arrays;
import java.util.Random;

public class OddToZero {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10+Math.abs(rand.nextInt()%20)];

        for(int i = 0; i < array.length; i++){
            array[i]= rand.nextInt()%100;
        }
        System.out.println(Arrays.toString(array));

        for(int i = 1; i < array.length; i+=2){
            array[i] = 0;
        }

        System.out.println(Arrays.toString(array));

    }
}
