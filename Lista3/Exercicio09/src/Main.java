import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Maxnumber = 10;
        int answer, replay;
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= Maxnumber; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j);

                System.out.println("Qual a resposta?");
                answer = in.nextInt();

                if (answer == i * j) {
                    System.out.println("Correto!");
                } else {
                    System.out.println("Incorreto! Jogar novamente?\n1. Sim\n2. Não");
                    replay = in.nextInt();

                    if (replay == 2) {
                        return;
                    } else {
                        j--;
                    }
                }
            }
        }
        System.out.println("Parabéns! Você acertou todas as operações.");
        System.out.println("Deseja jogar novamente? (1. Sim / 2. Não)");
        replay = in.nextInt();
        if (replay == 1) {
            main(args);
        } else {
            System.out.println("Obrigado por jogar!");
        }
    }
}
