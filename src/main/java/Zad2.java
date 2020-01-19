public class Zad2 {

public int[] zamiana(int [] arr) {
    int[] result = new int[arr.length];
    int n = arr.length - 1;
    for (int i = 0; i < n; i++) {
        result[i] = arr[i + 1];
        result[i + 1] = arr[i];
        i++;
    }
    if (arr.length % 2 != 0) {
        result[n] = arr[n];
    }
    return result;


}
}
