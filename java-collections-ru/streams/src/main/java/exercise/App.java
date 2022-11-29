package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App  {
    public static long getCountOfFreeEmails(List<String> emails) {
        var result = emails.stream()
                .filter(email -> {
                    String[] domens = new String[]{"gmail.com", "yandex.ru", "hotmail.com"};
                    var emailInArray = email.split("@");
                    return Arrays.asList(domens).contains(emailInArray[1]);
                });
        return result.count();
    }

    public static void main(String[] args) {
        String[] emails = {
                "info@gmail.com",
                "info@yandex.ru",
                "mk@host.com",
                "support@hexlet.io",
                "info@hotmail.com",
                "support.yandex.ru@host.com"
        };
        List<String> emailsList = Arrays.asList(emails);
        System.out.println(App.getCountOfFreeEmails(emailsList));
    }
}
// END
