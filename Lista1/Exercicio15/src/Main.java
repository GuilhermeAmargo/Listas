import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, h, pi=Math.PI, v;

        Scanner in= new Scanner(System.in);
        System.out.println("Digite o raio:");
        r=in.nextInt();
        System.out.println("Digite a altura:");
        h=in.nextInt();
        v=pi*(r*r)*h;
        System.out.println("O volume do cilindro é:"+v);


    }
}