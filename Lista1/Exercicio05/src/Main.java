import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kmh,ms;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade em km/h:");
        kmh=in.nextInt();
        ms=kmh/3.6;
        System.out.println("A velocidade em m/s é:"+ms);




    }
}