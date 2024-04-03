import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int plusLine, plusColumn;

        int[][] matriz = new int[5][5];
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = in.nextInt();
                //System.out.println(matriz[i][j]);
            }
        }
        System.out.println("Diagonal secundária da matriz:");
        for (int j = 0; j < 5; j++) {
            System.out.println(matriz[j][4 - j]);
        }
    }
}