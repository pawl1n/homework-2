import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

        for (int number : arr) {
            if (number %2 == 0) {
                System.out.println(number);
            }
        }
    }
}