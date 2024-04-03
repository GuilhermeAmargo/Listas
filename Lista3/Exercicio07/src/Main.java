import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int Maxnumber = 10;
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= Maxnumber; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (int j = 0; j <= 10; j++) {
                System.out.println(i * j);
            }
        }
    }
}