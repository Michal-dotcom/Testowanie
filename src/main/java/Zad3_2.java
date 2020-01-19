import java.util.Arrays;

public class Zad3_2 {
    public static void main(String[] args) {
        int[] daneWejsciowe = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tablicaNowa = new int[daneWejsciowe.length];

        int c = daneWejsciowe.length;
        for (int i = 0; i < c; i++) {
            if (i + 2 >= c) {
                tablicaNowa[i] = daneWejsciowe[i];
            } else {
                tablicaNowa[i] = daneWejsciowe[i] + daneWejsciowe[i + 2];
            }
        }
        System.out.println(Arrays.toString(daneWejsciowe));
        System.out.println(Arrays.toString(tablicaNowa));
      // return tablicaNowa;
    }
    }
