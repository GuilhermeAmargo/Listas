import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2, x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os coeficientes da equação ax^2 + bx + c = 0:");
        System.out.print("a: ");
        a = scanner.nextInt();
        System.out.print("b: ");
        b = scanner.nextInt();
        System.out.print("c: ");
        c = scanner.nextInt();

        delta = b * b - 4 * a * c;

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            x = -b / (2 * a);
            System.out.println("A única raiz da equação é: x = " + x);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }
    }
}
