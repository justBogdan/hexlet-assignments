package exercise;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> actual = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> actual2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertThat(App.take(list, 2)).isEqualTo(actual);
        assertThat(App.take(list, 3)).isEqualTo(actual2);
        // END
    }
}
