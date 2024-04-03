import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, height, area;

        Scanner in= new Scanner (System.in);
        System.out.println("Digite a base:");
        base=in.nextInt();
        System.out.println("Digite a altura:");
        height=in.nextInt();
        area=(base*height)/2;
        System.out.println("A área do triângulo é:"+area);
    }
}