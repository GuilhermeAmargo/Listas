import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, solucao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o coeficiente 'a':");
        a = scanner.nextInt();

        System.out.println("Digite o coeficiente 'b':");
        b = scanner.nextInt();

        if (a != 0) {
            solucao = -b / a;
            System.out.println("A solução da equação " + a + "x + " + b + " = 0 é:");
            System.out.println("x = " + solucao);
        } else if (b != 0) {
            System.out.println("A equação não tem solução.");
        } else {
            System.out.println("A equação tem infinitas soluções.");
        }
    }
}




