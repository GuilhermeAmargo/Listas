import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number, factorial;



        Scanner in = new Scanner (System.in);
        System.out.println("Digite um número para calcular seu fatorial:");
        number = in.nextInt();
        factorial = 1;
        for(int i=1; i<=number; i++){
            factorial *= i;
        }
        System.out.println("O resultado é:"+ factorial);
    }
}