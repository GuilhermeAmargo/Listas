import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double velin, acel, vel, time;

        Scanner in= new Scanner(System.in);
        System.out.println("Digite a velocidade inicial:");
        velin=in.nextInt();
        System.out.println("Digite a aceleração:");
        acel=in.nextInt();
        System.out.println("Digite o tempo:");
        time=in.nextInt();
        vel=velin+acel*time;
        System.out.println("A velocidade final é:"+vel);
    }
}