import java.util.Scanner;

public class VowelsAndConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        int vowelCount = 0;
        int consonentCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                vowelCount++;
            }
            else if (isConsonent(word.charAt(i))) {
                consonentCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount + " Consonents: " + consonentCount);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static boolean isConsonent(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) && !isVowel(c);
    }
}
