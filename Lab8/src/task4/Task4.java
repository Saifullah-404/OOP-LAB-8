package task4;

public class Task4 {

    public static void main(String[] args) {
        countVowelsAndConsonants("Hello, World!");
    }

    public static void countVowelsAndConsonants(String input) {

        String text = input.toUpperCase();
        int vowelCount = 0;
        int consonantCount = 0;

        for (char ch : text.toCharArray()) {

            if (ch >= 'A' && ch <= 'Z') {
                switch (ch) {
                    case 'A': case 'E': case 'I': case 'O': case 'U':
                        vowelCount++;
                        break;
                    default:
                        consonantCount++;
                }
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
