import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double r, h, v;

        Scanner in= new Scanner(System.in);
        System.out.println("Digite o raio:");
        r=in.nextInt();
        System.out.println("Digite a altura:");
        h=in.nextInt();
        v=(Math.PI*(r*r)*h)/3;
        System.out.println("O volume do cone é:"+v);


    }
}