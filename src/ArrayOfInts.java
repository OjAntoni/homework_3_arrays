import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfInts {

    public static void main(String[] args) {
        int[] array ={45,87,-65,4,32,0,56,653,-1,-2,-3,-4,-5};

        Scanner scanner = new Scanner(System.in);
        int myNum = Integer.parseInt(scanner.nextLine());
        Arrays.sort(array);
        if(Arrays.binarySearch(array, myNum)>0){
            System.out.println("Array includes "+myNum);
        }
        else {
            System.out.println("Array doesn't include "+myNum);
        }
    }
}
