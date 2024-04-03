import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner (System.in);
        System.out.println("Insira um número correspondente ao menu de opções:");
        number = in.nextInt();
        if (number >= 5 && number <= 9){
            System.out.println("Entrada validada, opção escolhida:" + number);
        } else {
            System.out.print("Entrada invalidada, opção inválida");
        }
    }
}