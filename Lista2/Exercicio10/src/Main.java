import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite três números inteiros:");
        System.out.print("Número 1:");
        n1 = in.nextInt();
        System.out.print("Número 2:");
        n2 = in.nextInt();
        System.out.print("Número 3:");
        n3 = in.nextInt();

        // Para N1 ser maior
        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println("A ordem crescente é:");
                System.out.println(n3);
                System.out.println(n2);
                System.out.println(n1);
            } else {
                System.out.println("A ordem crescente é:");
                System.out.println(n2);
                System.out.println(n3);
                System.out.println(n1);
            }
        }
        // Para N2 ser maior
        if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println("A ordem crescente é:");
                System.out.println(n3);
                System.out.println(n1);
                System.out.println(n2);
            } else {
                System.out.println("A ordem crescente é:");
                System.out.println(n1);
                System.out.println(n3);
                System.out.println(n2);
            }
        }
        // Para N3 ser maior
        if (n3 > n1 && n3 > n2){
            if (n2 > n1){
                System.out.println("A ordem crescente é:");
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            } else {
                System.out.println("A ordem crescente é:");
                System.out.println(n2);
                System.out.println(n1);
                System.out.println(n3);
            }
        }

    }
}