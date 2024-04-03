import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n1,n2,med;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nota 1:");
        n1=in.nextInt();
        System.out.println("Digite a nota 2:");
        n2=in.nextInt();
        med= (n1*1+n2*2)/2;
        System.out.println("A média é:"+med);
    }
}