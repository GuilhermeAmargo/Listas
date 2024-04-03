import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gerador = new Random();
        int verify;
        int[] numbers = new int[10];
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = gerador.nextInt(100);
            //System.out.println(numbers[i]);
        }
        System.out.println("Digite um valor para tentar encontrar no vetor:");
        verify = in.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == verify) {
                System.out.println("O número " + verify + " foi encontrado na posição " + i + " do vetor.");
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("Valor não encontrado!");
        }
    }
}

