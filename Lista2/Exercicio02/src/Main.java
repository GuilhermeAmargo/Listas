import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2;

        Scanner in= new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        n1=in.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        n2=in.nextInt();
        if (n1>n2){
            System.out.println("O primeiro número é maior:"+n1);
        }
        if(n1==n2){
            System.out.println("Ambos são iguais");
        }
        else {
            System.out.println("O segundo número é maior:"+n2);
        }
    }
}