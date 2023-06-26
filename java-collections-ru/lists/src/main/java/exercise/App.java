package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static void main(String[] args) {
        System.out.println(App.scrabble("rkqodlw", "world")); // true
        System.out.println(App.scrabble("ajv", "java")); // false
        System.out.println(App.scrabble("avjafff", "JaVa")); // true
        System.out.println(App.scrabble("", "hexlet")); // false
    }

    public static boolean scrabble(String setOfLetters, String word) {
        List<Character> setOfLettersList = new ArrayList<>();
        for (char letter : setOfLetters.toCharArray()) {
            setOfLettersList.add(Character.toLowerCase(letter));
        }

        for (char letter : word.toCharArray()) {
            Character lowercaseChar = Character.toLowerCase(letter);
            if (setOfLettersList.contains(lowercaseChar)) {
                setOfLettersList.remove(lowercaseChar);
            } else {
                return false;
            }
        }

        return true;
    }
}
//END