import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       double mil,pol;

       Scanner in = new Scanner(System.in);
       System.out.println("Digite a medida em milimetro:");
       mil=in.nextInt();
       pol=mil/25.4;
       System.out.println("A medida em polegadas é:"+pol);


    }
}