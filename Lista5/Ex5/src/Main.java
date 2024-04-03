import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho do array de busca: ");
        int choice = in.nextInt();

        int[] Array = new int[choice];

        System.out.println("Digite os elementos do array de busca: ");
        for(int i = 0; i < Array.length; i++) {
            Array[i] = in.nextInt();
        }

        Arrays.sort(Array);

        System.out.println("Digite um elemento para buscar: ");
        int target = in.nextInt();

        int resultIndex = binary(Array, target);

        if (resultIndex != -1) {
            System.out.println(target + " foi encontrado na posição: " + resultIndex);
        } else {
            System.out.println("Elemento não encontrado.");
        }
        in.close();
    }

    public static int binary(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
