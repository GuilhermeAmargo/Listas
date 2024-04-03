import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double price, discount, discountedprice, m2, m5;
        int option, tranche;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor da compra:");
        price = in.nextDouble();

        System.out.println("Menu:");
        System.out.println("1. Débito");
        System.out.println("2. Pix");
        System.out.println("3. Crédito");

        System.out.println("Forma de pagamento:");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("Débito selecionado");
                discount = price * 0.05;
                discountedprice = price - discount;
                System.out.println("Valor final da compra: R$" + discountedprice);
                break;

            case 2:
                System.out.println("Pix selecionado");
                discount = price * 0.1;
                discountedprice = price - discount;
                System.out.println("Valor final da compra: R$" + discountedprice);
                break;

            case 3:
                System.out.println("Crédito selecionado");
                System.out.println("Escolha o número de parcelas");
                tranche = in.nextInt();

                if (tranche <= 4) {
                    m2 = price + price * 0.02 * tranche;
                    System.out.println("Valor final da compra: R$" + m2);
                } else {
                    m5 = price + price * 0.05 * tranche;
                    System.out.println("Valor final da compra: R$" + m5);

                }
                break;
            default:
                System.out.println("Opção inválida!");

        }


    }
}