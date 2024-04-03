import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String word, copy = "";
    int i, size;

    Scanner in = new Scanner (System.in);

        System.out.println("Digite uma palavra: ");
        word = in.nextLine();

        palindrome(word);
    }

    public static void palindrome (String word){
       int i, size = word.length();
       String copy= "";

        for (i = 0; i < word.length(); i++){
            copy += word.charAt(size - 1);
            size --;

        }
        if(word.equals(copy)){
            System.out.println("A palavra " + word + " é um palíndromo");
        } else {
            System.out.println("A palavra " + word + " não é um palíndromo");
        }
    }

}