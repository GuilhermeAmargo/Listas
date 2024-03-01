import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r1, r2, a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores das raízes r1 e r2:");
        r1 = scanner.nextDouble();
        r2 = scanner.nextDouble();

        // Calcular os coeficientes da equação do segundo grau
         a = 1;
         b = -(r1 + r2);
         c = r1 * r2;

        System.out.println("A equação do segundo grau é: ");
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
    }
}
