import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1, r;

        Scanner in= new Scanner(System.in);
        System.out.println("Digite um número real:");
        n1=in.nextDouble();
        if (n1>=0){
            System.out.println("A raiz quadrada desse número é:"+(Math.sqrt(n1)));
        } else {
            System.out.println("Valor inválido!");
        }
    }
}