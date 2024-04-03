import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner (System.in);

        System.out.println("Digite um número inteiro para calcular seu fatorial: ");
        number = in.nextInt();
        System.out.println("O fatorial de "+ number + " é " + factorial(number));
    }
    static int factorial (int number){
        if (number < 0)
            return 0;
        else if (number == 0)
            return 1;
        else {
            return number * factorial(number - 1);
        }
        }
    }
