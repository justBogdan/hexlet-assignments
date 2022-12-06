package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String dataFile) {
        var lines = dataFile.split("\n");
        return (String) Arrays.stream(lines)
                .filter(line -> line.startsWith("environment="))
                .map(line -> line.replaceAll("environment=", ""))
                .map(line -> line.replaceAll("\"", ""))
                .map(line -> line.split(","))
                .flatMap(Arrays::stream)
                .filter(variable -> variable.startsWith("X_FORWARDED_"))
                .map(variable -> variable.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));

    }

    public static void main(String[] args) {
        var variables = "X_FORWARDED_MAIL=tirion@google.com,X_FORWARDED_HOME=/home/tirion,language=en";
        var result = getForwardedVariables(variables);
        System.out.println(result);
    }
}
//END
