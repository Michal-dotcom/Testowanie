public class Zad1 {
    public int[] odwroc(int[] arr) {
        int [] result = new int[arr.length];
        for (int i=0; i< arr.length; i++){
            result[i] = arr[arr.length-1-i];
        }
        return result;
    }
}