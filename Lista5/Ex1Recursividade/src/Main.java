import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        n = in.nextInt();

        System.out.println(soma(n));
    }

    static int soma(int n) {
        if (n <= 0)
            return 0;
        else {
                return n + soma(n - 1);
            }
        }
    }
