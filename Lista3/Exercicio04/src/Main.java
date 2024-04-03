import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i = -80;
        Scanner in = new Scanner (System.in);

        System.out.println("Conversão Graus Celsius - Fahrenheit");
        while(i <= 80){
            System.out.println(i + "ºC " +  (1.8*i+32)+"ºF");
            i += 10;
        }
    }
}