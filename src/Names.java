import java.util.Arrays;

public class Names {
    public static void main(String[] args) {
        String[] names = {"James", "Anton", "Andrew", "Joanna", "David", "Bob", "Alex", "Witalij"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(names));
    }
}
