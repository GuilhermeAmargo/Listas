import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1, number2, inter;
        Scanner in = new Scanner (System.in);

        System.out.println("Digite dois números inteiros:");
        number1 = in.nextInt();
        number2 = in.nextInt();
        inter = number1 -number2;

        if(number1 > number2){
            int trade = number1;
            number1 = number2;
            number2 = trade;
        }


        System.out.println("Números entre " + number1 + " e " + number2 + ":");
        for (int i = number1 + 1; i < number2; i++) {
            System.out.print(i + " ");
        }
        }

    }
