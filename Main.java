import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String keyword = sc.nextLine();

        sentence = sentence.trim();
        String[] words = sentence.split(" +");

        StringBuilder cleaned = new StringBuilder();
        int shortest = words[0].length();
        String shortestWord = words[0].toLowerCase();
        int keywordCount = 0;
        int vowelCount = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            if (i > 0) {
                cleaned.append(" ");
            }

            cleaned.append(word);

            if (word.length() < shortest) {
                shortest = word.length();
                shortestWord = word;
            }

            if (word.equalsIgnoreCase(keyword)) {
                keywordCount++;
            }
        }

        cleaned.setCharAt(0, Character.toUpperCase(cleaned.charAt(0)));

        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Sentence: " + cleaned);
        System.out.println("Words: " + words.length);
        System.out.println("Shortest word: " + shortestWord);
        System.out.println("Keyword count: " + keywordCount);
        System.out.println("Vowels: " + vowelCount);

        sc.close();
    }
}