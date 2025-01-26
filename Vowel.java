import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        try (Scanner get = new Scanner(System.in)) {
            System.out.println("Enter a Word to check for Vowels:");
            String name = get.nextLine();
            name = name.toLowerCase();
            String[] vowels = {"a", "e", "i", "o", "u"}; int counter = 0;
            for(int i = 0; i < 5; i++) {
                if (name.contains(vowels[i])) {
                    counter++;
                }
            }
            System.out.printf("Of the 5 vowels, the ones present in the string are: %d", counter);
        }
    }
}
