import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        Scanner in = new Scanner (System.in);

        System.out.println("Digite os 10 valores:");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = in.nextInt();
            if(numbers[i]%2==0){
                System.out.println(numbers[i]+2);
            } else {
                System.out.println(numbers[i]*2);
            }
        }
    }
}