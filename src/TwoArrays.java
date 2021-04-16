public class TwoArrays {
    public static void main(String[] args) {
        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];

        int sumOne = 0;
        int sumTwo = 0;

        for(int num : arrayOne) sumOne+=num;
        for(int num : arrayTwo) sumTwo+=num;

        double averageOne = ((double)sumOne)/(arrayOne.length);
        double averageTwo = ((double)sumTwo)/(arrayTwo.length);

        if(averageOne > averageTwo){
            System.out.println("First average("+averageOne+") is bigger than second average("+averageTwo+")");
        }
        if(averageTwo > averageOne){
            System.out.println("Second average("+averageTwo+") is bigger than first average("+averageOne+")");
        }
        else {
            System.out.println("Second average("+averageTwo+") is equal to first average("+averageOne+")");
        }
    }
}
