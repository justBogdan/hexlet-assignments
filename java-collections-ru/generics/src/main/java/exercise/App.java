package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> map) {
        List<Map<String, String>> result = new ArrayList<>();
        for (var book : books) {
            var bookParams = book.entrySet();
            var keys = map.entrySet();
            if (bookParams.containsAll(keys)) {
                result.add(book);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Map<String, String>> books = new ArrayList<>();
        Map<String, String> book1 = new HashMap<>(
                Map.of("title", "Cymbeline", "author", "Shakespeare", "year", "1611")
        );
        Map<String, String> book2 = new HashMap<>(
                Map.of("title", "Book of Fooos", "author", "FooBar", "year", "1111")
        );
        Map<String, String> book3 = new HashMap<>(
                Map.of("title", "The Tempest", "author", "Shakespeare", "year", "1611")
        );
        Map<String, String> book4 = new HashMap<>(
                Map.of("title", "Book of Foos Barrrs", "author", "FooBar", "year", "2222")
        );
        Map<String, String> book5 = new HashMap<>(
                Map.of("title", "Still foooing", "author", "FooBar", "year", "3333")
        );
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        Map<String, String> where = new HashMap<>(Map.of("author", "Shakespeare", "year", "1611"));
        System.out.println(App.findWhere(books, where));
    }
}
//END
