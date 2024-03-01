import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner (System.in);

        System.out.println("Insira um número para mostrar o dia da semana:");
        number = in.nextInt();

        switch(number){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda-feira");
                break;
            case 3:
                System.out.println("terça-feira");
                break;
            case 4:
                System.out.println("quarta-feira");
                break;
            case 5:
                System.out.println("quinta-feira");
                break;
            case 6:
                System.out.println("sexta-feira");
                break;
            case 7:
                System.out.println("sábado");
                break;
            default:
                System.out.println("Dia inválido!");
        }

    }
}