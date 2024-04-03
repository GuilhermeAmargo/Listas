import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double n1, n2, result;

        Scanner in= new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        n1=in.nextInt();
        System.out.println("Digite a segunda nota:");
        n2=in.nextInt();
        result=(n1+n2)/2;
        System.out.println("A média das notas é:"+result);

    }
}