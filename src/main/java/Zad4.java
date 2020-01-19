
import java.util.ArrayList;
import java.util.List;


public class Zad4 {
    public static List<Integer> lista(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int sum = 0;
        for (int liczba: arr){
            sum += liczba;
        }
        double ave = (double) sum / n;
        for (int i = 0; i < n; i++) {
            if (arr[i]>=ave){
                result.add(arr[i]);
            }
        }
        return result;
    }
}