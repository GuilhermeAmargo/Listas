import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1, n2, med;

        Scanner in= new Scanner (System.in);
        System.out.println("Digite a nota 1:");
        n1=in.nextDouble();
        System.out.println("Digite a nota 2:");
        n2=in.nextDouble();
        med=(n1+n2)/2;
        System.out.println("A média é:"+med);
        if (med >= 8.5){
            System.out.println("A");
        }
        if (med >= 7 && med < 8.5){
            System.out.println("B");
        }
        if (med >= 5 && med <7){
            System.out.println("C");
        }
        if (med <5){
            System.out.println("D");
        }
    }
}