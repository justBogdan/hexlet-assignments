package exercise;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    void mainTest() {
        String[][] actual = new String[][] {
                {"1", " ", " ", "2"},
                {"1", " ", " ", "3"},
                {"1", " ", " ", "4"},
        };
        String[][] expected = new String[][] {
                {"1", "1", " ", " ", " ", " ", "2", "2"},
                {"1", "1", " ", " ", " ", " ", "2", "2"},
                {"1", "1", " ", " ", " ", " ", "3", "3"},
                {"1", "1", " ", " ", " ", " ", "3", "3"},
                {"1", "1", " ", " ", " ", " ", "4", "4"},
                {"1", "1", " ", " ", " ", " ", "4", "4"},
        };
        assertThat(App.enlargeArrayImage(actual)).isEqualTo(expected);
    }
}
