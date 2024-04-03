import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2, nr,med, medr;

        Scanner in =new Scanner(System.in);
        System.out.println("Digite a nota 1:");
        n1=in.nextInt();
        System.out.println("Digite a nota 2:");
        n2=in.nextInt();
        med=(n1+n2)/2;
        System.out.println("A média é:"+med);
        if (med >= 50){
            System.out.println("Aprovado");
        } else {
            System.out.println("Insira a nota da prova de recuperação:");
            nr=in.nextInt();
            medr=(med+nr)/2;
            System.out.println("A nova média é:"+medr);
            if (medr < 50){
                System.out.println("Reprovado");
            } else {
                System.out.println("Aprovado");
            }
        }

    }
}