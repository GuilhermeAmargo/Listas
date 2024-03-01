import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        double raio, area, pi = Math.PI;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio:");
        raio = in.nextInt();
        area = raio * raio * pi;
        System.out.println("A área do círculo é:" + area);
    }
}