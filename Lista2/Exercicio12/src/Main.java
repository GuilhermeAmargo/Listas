import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int option;
        double number1, number2;

        Scanner in = new Scanner (System.in);
        System.out.println("Digite dois números:");
        System.out.print("Número 1:");
        number1 = in.nextDouble();
        System.out.print("Número 2:");
        number2 = in.nextDouble();

        System.out.println("Digite uma opção:");
        System.out.println("1.Soma");
        System.out.println("2.Subtração");
        System.out.println("3.Multiplicação");
        System.out.println("4.Divisão");
        option = in.nextInt();
        System.out.println("Opção escolhida:"+option);
        switch (option){
            case 1:
                System.out.print("Resultado:" + (number1+number2));
                break;
            case 2:
                System.out.print("Resultado:" + (number1-number2));
                break;
            case 3:
                System.out.print("Resultado:" + (number1*number2));
                break;
            case 4:
                System.out.print("Resultado:" + (number1/number2));
                break;
            default:
                System.out.print("Opcão inválida!");
                break;

        }
    }
}