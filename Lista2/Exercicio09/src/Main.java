import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double l1, l2, l3;

        Scanner in = new Scanner (System.in);
        System.out.println("Digite os 3 lados de um triângulo:");
        System.out.print("Lado 1:");
        l1 = in.nextDouble();
        System.out.print("Lado 2:");
        l2 = in.nextDouble();
        System.out.print("Lado 3:");
        l3 = in.nextDouble();
        if (l1 >0 && l2 >0 && l3 >0) {
            if (l1 == l2 &&  l2 == l3){
                System.out.println("Esse é um triângulo equilátero");
            }
            if (l1 == l2 || l1 == l3 || l2 == l3){
                System.out.println("Esse é um triângulo isósceles");
            }
            else {
                System.out.println("Esse é um triângulo escaleno");
            }
        }
        else {
            System.out.println("Valores inválidos");
        }
    }
}