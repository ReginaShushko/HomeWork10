package homeWork10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork10Task2 {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(getCharCount(str));

    }

    public static <K> Map<Character, Integer> getCharCount(String s) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (charFrequency.containsKey(c)) {
                charFrequency.put(c, charFrequency.get(c) + 1);
            } else {
                charFrequency.put(c, 1);
            }
        }

        return charFrequency;
    }
}


