import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double Cels,Fahre;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius:");
        Cels=in.nextInt();
        Fahre= Cels*9/5+32;
        System.out.println("A temperatura em Fahrenheit é:"+Fahre);
    }
}