import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();

        int aux;
        int[] numbers = new int[10];
        System.out.println("Vetor:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = gerador.nextInt(100);
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < 5; i++) {
            aux = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = aux;
        }
        System.out.println("\nVetor invertido:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}