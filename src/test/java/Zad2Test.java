import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zad2Test {
    int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    @Test
    void zamiana() {
        int[] daneWejsciowe = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] wynik = new Zad2().zamiana(arr);
        int[] oczekiwanywynik = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
        assertArrayEquals(oczekiwanywynik, wynik);
    }
}