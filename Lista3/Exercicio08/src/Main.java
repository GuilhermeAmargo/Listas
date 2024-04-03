import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int number, option;
        boolean prime;

        do {
            System.out.println("Digite um número:");
            number = in.nextInt();
            prime = true;

            if (number < 1) {
                prime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        prime = false;
                    }
                }
            }
            if (prime == true) {
                System.out.println(number + " é um número primo");
            } else {
                System.out.println(number + " não é um número primo");
            }

            System.out.println("Inserir outro número?\n1. Sim\n2. Não");
            option = in.nextInt();
        } while (option != 2);

    }
}