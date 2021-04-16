import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Random;

public class bubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10+Math.abs(rand.nextInt()%50)];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt()%100;
        }

        System.out.println(Arrays.toString(numbers));

        for(int i = numbers.length-1; i>=0; i--){
            for(int j = 1; j <= i; j++){
                if(numbers[j-1]>numbers[j]){
                    int tmp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

    }
}
