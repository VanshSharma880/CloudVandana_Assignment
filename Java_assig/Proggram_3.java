//3) Check if the input is pangram or not

import java.util.Scanner;

public class Proggram_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        
        boolean[] mark = new boolean[26];

        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                mark[index] = true;
            }
        }

        for (boolean b : mark) {
            if (!b) {
                return false; // Not a pangram
            }
        }

        return true; // It's a pangram
    }
}