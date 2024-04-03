import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner (System.in);

        System.out.println("Digite um número inteiro: ");
        n = in.nextInt();
        if (n > 0 ){
            soma(n);
            System.out.println("Soma: "+soma(n));
        } else {
            System.out.println("Valor inválido!\nDigite um número maior que 0");
            n = in.nextInt();
        }

    }
    static int soma (int n){
        int soma = 0;
        for (int i = 1; i <= n; i++){
            soma += i;
        }
        return soma;
    }
}