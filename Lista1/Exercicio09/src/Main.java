import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km,mi;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a distância em quilômetros:");
        km=in.nextInt();
        mi=km*0.621371;
        System.out.println("A distância em milhas é:"+mi);

    }
}