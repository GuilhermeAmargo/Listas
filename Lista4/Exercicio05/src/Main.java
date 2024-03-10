import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[10];

        for (int i = 0; i < 10; i++) {
            v2[i] = v1[9 - i];
        }
        System.out.println("Vetor v1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(v1[i]);
        }
        System.out.println("\n");
        System.out.println("Vetor v2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(v2[i]);
        }
    }
}