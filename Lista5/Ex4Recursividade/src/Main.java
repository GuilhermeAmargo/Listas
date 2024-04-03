import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        word = in.nextLine();

        if(Palindrome(word))
            System.out.println("A palavra " + word + " é um palíndromo");
        else
            System.out.println("A palavra " + word + " não é um palíndromo");
    }

    public static boolean Palindrome(String word) {
        if(word.length() <= 1)
            return true;
        else {
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            String middle = word.substring(1, word.length() - 1);
            return (firstChar == lastChar) && Palindrome(middle);
        }
    }
}
