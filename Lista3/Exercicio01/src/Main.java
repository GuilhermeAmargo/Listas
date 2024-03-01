import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        int i = 0;

        Scanner in = new Scanner (System.in);
        System.out.println("Digite um número:");
        number = in.nextInt();
        System.out.println("A tabuada é:");

        while(i<=10){
            System.out.println(number * i);
            i++;
        }
    }
}