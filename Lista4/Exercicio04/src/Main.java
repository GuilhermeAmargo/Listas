import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int max, min, number;
        Scanner in = new Scanner(System.in);
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        int [] numbers = new int[10];

        System.out.println("Digite 10 valores para o vetor:");
        for (int i=0; i<10;i++) {
            numbers[i] = in.nextInt();

            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("O maior número é:"+ max);
        System.out.println("O menor número é:"+ min);
    }
}