import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayFromFiveToTen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array(it must be from five to ten): ");
        int len = Integer.parseInt(scanner.nextLine());
        while(len <= 5 || len > 10){
            System.out.print("Enter length of array(it must be from one to five): ");
            len = Integer.parseInt(scanner.nextLine());
        }

        int[] array = new int[len];

        Random rand = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt()%15;
        }

        System.out.println(Arrays.toString(array));

        int len2 = array.length/2;
        int array2[] = new int[len2];
        for(int i = 0, j = 0; i < len2; i++, j+=2){
            array2[i] = array[j];
        }

        System.out.println(Arrays.toString(array2));

    }
}
