package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String letters, String word) {
        var lettersBank = letters.toLowerCase().split("");
        var lowerWord = word.toLowerCase().split("");
        List<String> letterList = new ArrayList<>();
        for (var el : lettersBank) {
            letterList.add(el);
        }
        for (var letter : lowerWord) {
            if (letterList.contains(letter)) {
                var index = letterList.indexOf(letter);
                letterList.remove(index);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(scrabble("rkqodlw", "world"));
    }
}
//END
