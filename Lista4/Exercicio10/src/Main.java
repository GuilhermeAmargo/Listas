import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[3][2];
        int[][] matriz2 = new int[2][2];
        int[][] product = new int[3][2];

        System.out.println("Digite os elementos da matriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = in.nextInt();
            }
        }

        System.out.println("Digite os elementos da matriz 2x2:");
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                matriz2[k][l] = in.nextInt();
            }
        }

        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 2; n++) {
                for (int k = 0; k < 2; k++) {
                    product[m][n] += matriz[m][k] * matriz2[k][n];
                }
            }
        }

        System.out.println("Matriz Produto:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(product[i][j]);
            }

        }
    }
}
