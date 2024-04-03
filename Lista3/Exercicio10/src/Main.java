import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int first = 0, second = 1, n, next;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor para gerar a sequência de Fibonacci: ");
        n = in.nextInt();

        System.out.println("Sequência de Fibonacci até o " + n + "º termo: ");

        if (n >= 1) {
            System.out.print(first);
        }
        if (n >= 2) {
            System.out.print(", " + second);
        }

        for (int i = 3; i <= n; i++) {
            next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
