import java.util.Arrays;

public class Zad6 {
    public static int[] sortOdd(int[] inputArray) {
        int temp;
        //ma wyjść: 1, 3, 2, 8, 5, 4
        int array[] = {5, 3, 2, 8, 1, 4};
        int[] sortedArray = new int[array.length];
        for (int j = 0; j < array.length - 1; j++) {
            for (int x = 0; x < array.length - 1; x++) {

                while (array[x] % 2 == 0 && x < array.length - 1) {
                    x++;
                }
                int y = x + 1;

                if (y < array.length) {
                    while (array[y] % 2 == 0 && y < array.length - 1) {
                        y++;
                    }

                    if (array[x] > array[y] && array[y] % 2 == 1 && array[x] % 2 == 1) {
                        temp = array[x];
                        array[x] = array[y];
                        array[y] = temp;
                        sortedArray = array;
                    }
                }
            }
        }
        return sortedArray;
    }
}