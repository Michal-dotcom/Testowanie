import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


class Zad6Test {
    @Test
    void sortowanie() {
        int[] arr = {5, 3, 2, 8, 1, 4};
        int [] expected = {1, 3, 2, 8, 5, 4};
        int[] result = new Zad6().sortOdd(arr);
        assertArrayEquals(result, expected);
    }
}