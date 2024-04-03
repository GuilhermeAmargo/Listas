import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int x, y, pow;
    
    Scanner in = new Scanner (System.in);

        System.out.println("Digite um número para a base: ");
        x = in.nextInt();
        System.out.println("Digite um número para o expoente: ");
        y = in.nextInt();
        if (y >= 0){
        pow(x,y);
        System.out.println("A potência é: " + pow(x,y));
        } else {
            System.out.println("Valor inválido");
        }
    }
    static int pow (int x, int y){
        int resposta = 1;
        for (int i = 1; i <=y; i++ ){
            resposta = resposta * x;
        }
        return resposta;
    }
}