import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x, y;

        Scanner in = new Scanner (System.in);

        System.out.println("Digite um número para a base: ");
        x = in.nextInt();
        System.out.println("Digite um número para o expoente: ");
        y = in.nextInt();

        if (y >= 0){
            int result = pow(x,y);
            System.out.println("A potência é: " + pow(x,y));
        } else {
            System.out.println("Valor inválido");
        }
    }
    static int pow (int x, int y){
        if(y == 0)
            return 1;
        else if (y == 1)
            return x;
        else
            return x * pow (x, y -1);
    }
}