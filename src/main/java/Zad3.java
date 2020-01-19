import java.util.Arrays;

public class Zad3 {


    public int[] dodawacz(int[] arr) {

        //   int[] daneWejsciowe = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tablicaNowa = new int[arr.length];

        int c = arr.length;
        for (int i = 0; i < c; i++) {
            if (i + 2 >= c) {
                tablicaNowa[i] = arr[i];
            } else {
                tablicaNowa[i] = arr[i] + arr[i + 2];
            }
        }
        return tablicaNowa;
    }
}
