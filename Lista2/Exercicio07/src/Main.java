import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a, b, c, x1, x2, x, delta;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite os coeficientes da equação do segundo grau (ax^2 + bx + c = 0):");
        System.out.print("a: ");
        a = in.nextDouble();
        System.out.print("b: ");
        b = in.nextDouble();
        System.out.print("c: ");
        c = in.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            x = -b / (2 * a);
            System.out.println("A raiz dupla é x = " + x);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }
    }
}
