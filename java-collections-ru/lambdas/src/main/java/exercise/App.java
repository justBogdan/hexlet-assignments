package exercise;



import java.util.Arrays;


// BEGIN
public class App {
    public static String[] dupl(String[] items) {
        return Arrays.stream(items)
                .flatMap(item -> Arrays.stream(new String[] {item, item}))
                .toArray(String[]::new);
    }
    public static String[][] enlargeArrayImage(String[][] image) {
        String[][] horizont = Arrays.stream(image)
                .map(App::dupl)
                .toArray(String[][]::new);
        return Arrays.stream(horizont)
                .flatMap(line -> Arrays.stream(new String[][] {line, line}))
                .toArray(String[][]::new);
    }
}
// END
