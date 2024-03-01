import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double money, change;
        int option;

        Scanner in = new Scanner (System.in);
        System.out.println("Insira o valor:");
        money = in.nextDouble();

        System.out.println("Menu");
        System.out.println("1. Café Expresso R$ 0,50");
        System.out.println("2. Café Longo R$ 1,00");
        System.out.println("3. Capuccino R$ 2,50");
        System.out.println("4. Chocolate R$ 2,00");

        System.out.println("Escolha uma opção:");
        option = in.nextInt();

        switch(option){
            case 1:
                System.out.println("Bebida escolhida: Café Expresso");
                change = money - 0.50;
                if (change <0){
                    System.out.println("Valor inválido!");
                } else {
                System.out.println("Seu troco: R$" + change);}
                break;

            case 2:
                System.out.println("Bebida escolhida: Café Longo");
                change = money - 1.00;
                if (change <0){
                    System.out.println("Valor inválido!");
                } else {
                    System.out.println("Seu troco: R$" + change);}
                    break;

            case 3:
                System.out.println("Bebida escolhida: Capuccino");
                change = money - 2.50;
                if (change <0){
                    System.out.println("Valor inválido!");
                } else {
                    System.out.println("Seu troco: R$" + change);}
                    break;

            case 4:
                System.out.println("Bebida escolhida: Chocolate");
                change = money - 2.00;
                if (change <0){
                    System.out.println("Valor inválido!");
                } else {
                    System.out.println("Seu troco: R$" + change);}
                    break;


        }




    }
}