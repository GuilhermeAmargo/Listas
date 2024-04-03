import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        Scanner in = new Scanner (System.in);

        System.out.println("Digite os 10 valores:");
        numbers[0] = in.nextInt();
        numbers[1] = in.nextInt();
        numbers[2] = in.nextInt();
        numbers[3] = in.nextInt();
        numbers[4] = in.nextInt();
        numbers[5] = in.nextInt();
        numbers[6] = in.nextInt();
        numbers[7] = in.nextInt();
        numbers[8] = in.nextInt();
        numbers[9] = in.nextInt();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}