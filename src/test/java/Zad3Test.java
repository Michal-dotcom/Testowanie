import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zad3Test {
    @Test
    void dodawacz() {
        int[] daneWejsciowe = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] wynik = new Zad3().dodawacz(daneWejsciowe);
        int[] oczekiwanywynik = {4, 6, 8, 10, 12, 14, 16, 18, 9, 10};
        assertArrayEquals(oczekiwanywynik, wynik);
    }
}