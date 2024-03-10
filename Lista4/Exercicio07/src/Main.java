import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);

       int plusLine, plusColumn;

        int[][] matriz = new int[5][5];
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = in.nextInt();
            }
        }
                int biggerplusLine = Integer.MIN_VALUE;
                for (int i = 0; i < 5; i++) {
                    plusLine = 0;
                    for (int j = 0; j < 5; j++) {
                        plusLine += matriz[i][j];
                    }
                    if (plusLine > biggerplusLine) {
                        biggerplusLine = plusLine;
                    }
                }
            int biggerplusColumn = Integer.MIN_VALUE;
        for (int j = 0; j < 5; j++) {
            plusColumn = 0;
            for (int i = 0; i < 5; i++) {
                plusColumn += matriz[i][j];
            }
            if (plusColumn > biggerplusColumn) {
                biggerplusColumn = plusColumn;
            }
        }
        System.out.println("Maior soma entre as linhas: " + biggerplusLine);
        System.out.println("Maior soma entre as colunas: " + biggerplusColumn);
    }
        }
