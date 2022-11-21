package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String str) {
        Map<String, Integer> wordsCount = new HashMap<>();
        String[] words = str.split(" ");
        for (var el : words) {
            if (el.equals("")) {
                continue;
            }
            if (!wordsCount.containsKey(el) && !el.equals("")) {
                wordsCount.put(el, 0);
            }
            if (wordsCount.containsKey(el)) {
                var counter = wordsCount.get(el);
                wordsCount.put(el, counter + 1);
            }
        }

        return wordsCount;
    }
    public static String toString(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        var string = "{\n";
        for (var key : keys) {
            string += "  " + key + ": " + map.get(key) + "\n";
        }
        return string.length() == 2 ? "{}" : string + "}";
    }

    public static void main(String[] args) {
        String sentence = "java is the best programming language java";
        var wordCount = getWordCount(sentence);
        System.out.println(toString(wordCount));
    }
}
//END
