import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        int[] numbers = new int[30];
        Random rand = new Random(); //для рандомных int

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt()%11; // берем новое значение для int
        }
        System.out.println(Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the number to delete: ");
        int num = Integer.parseInt(scanner.nextLine());

        if(findNum(numbers, num)<0){
            System.out.println("Array doesn't contain "+num);
            System.exit(-1); //выходим из программы
        }

        int newLength = 0; // считаем длинну нового массива
        for (int number : numbers) {
            if (number != num) newLength++;
        }

        int[] newArray = new int[newLength]; //новый массив с новой нужной длинной
        for(int i = 0, j = 0; i < numbers.length && j < newLength; i++) { //i для старого, j для нового
            if(numbers[i] != num) {
                newArray[j]=numbers[i];
                j++;                       //если число подходит, то копируем в новыц массив
            }
        }

        numbers = null;

        System.out.println(Arrays.toString(newArray));
    }

    public static int findNum(int[] array, int num){
        for(int a : array){
            if(a==num) return 1;
        }
        return -1;
    }
}
