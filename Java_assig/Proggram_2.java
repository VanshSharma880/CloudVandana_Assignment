//2) Enter a Roman Number as input and convert it to an integer.

import java.util.Scanner;

public class Proggram_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine().toUpperCase(); 

        int result = romanToInteger(romanNumeral);

        if (result == -1) {
            System.out.println("Invalid Roman numeral input.");
        } else {
            System.out.println("Integer equivalent: " + result);
        }
    }

    public static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanCharToInt(s.charAt(i));
            
            if (i < s.length() - 1) {
                int nextVal = romanCharToInt(s.charAt(i + 1));
                
                if (currentVal < nextVal) {
                    result -= currentVal;
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}
