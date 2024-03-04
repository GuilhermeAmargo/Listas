import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int max, min, number;
        Scanner in = new Scanner(System.in);
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

         for (int i=1; i<=5;i++) {
             System.out.println("Digite o " + i  + "º número inteiro:");
             number = in.nextInt();

             if(number > max){
                 max = number;
             }
             if(number < min){
                 min = number;
             }
         }
        System.out.println("O maior número é:"+ max);
        System.out.println("O menor número é:"+ min);
    }
    }
