import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number , factorial;

        Scanner in = new Scanner (System.in);

        System.out.println("Digite um número inteiro para calcular seu fatorial: ");
        number = in.nextInt();
        factorial(number);
        System.out.println("O fatorial de "+ number + " é " + factorial(number));
    }
    static int factorial (int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial *= i;
        }
    return factorial;
    }
}