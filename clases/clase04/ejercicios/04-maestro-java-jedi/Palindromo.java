import java.util.Arrays;

public class Palindromo {
    public static void main(String[] args) {
        char[] word = { 'n', 'e', 'u', 'q', 'u', 'e', 'n' };
        char[] reverseWord = new char[word.length];
        boolean esPalindromo = true;

        for (int i = word.length - 1; i >= 0; i--) {
            reverseWord[reverseWord.length - 1 - i] = word[i];
        }

        for (int i = 0; i < word.length; i++) {
            if (word[i] != reverseWord[i]) {
                esPalindromo = false;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es palindromo.");
        } else {
            System.out.println("La palabra NO es palindromo.");
        }
    }
}