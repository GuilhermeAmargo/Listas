import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho do array de busca: ");
        int choice = in.nextInt();

        int[] array = new int[choice];

        System.out.println("Digite os elementos do array de busca (em ordem crescente): ");
        for(int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("Digite um elemento para buscar: ");
        int target = in.nextInt();

        int resultIndex = binarySearch(array, target, 0, array.length - 1);

        if (resultIndex != -1) {
            System.out.println(target + " foi encontrado na posição: " + resultIndex);
        } else {
            System.out.println("Elemento não encontrado.");
        }

        in.close();
    }

    public static int binarySearch(int[] array, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target)
                return mid;
            else if (array[mid] < target)
                return binarySearch(array, target, mid + 1, high);
            else
                return binarySearch(array, target, low, mid - 1);
        }
        return -1;
    }
}
