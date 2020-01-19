import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class Zad1Test {
    @Test
    void odwroc() {
        int[]daneWejsciowe={1,2,3,4,5,6,7,8,9,10};
        int[] wynik = new Zad1().odwroc(daneWejsciowe);
        int [] oczekiwanywynik = {10,9,8,7,6,5,4,3,2,1};
        assertArrayEquals(oczekiwanywynik, wynik);
    }
}