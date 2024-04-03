import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Matriz A:");
        System.out.print("Digite o número de linhas da matriz A: ");
        int linhasA = in.nextInt();
        System.out.print("Digite o número de colunas da matriz A: ");
        int colunasA = in.nextInt();

        System.out.println("Matriz B:");
        System.out.print("Digite o número de linhas da matriz B: ");
        int linhasB = in.nextInt();
        System.out.print("Digite o número de colunas da matriz B: ");
        int colunasB = in.nextInt();

        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar as matrizes. O número de colunas da matriz A deve ser igual ao número de linhas da matriz B.");
            return;
        }

        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];
        int[][] produto = new int[linhasA][colunasB];

        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                matrizA[i][j] = in.nextInt();
            }
        }

        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                matrizB[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    produto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("Matriz Produto:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(produto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
