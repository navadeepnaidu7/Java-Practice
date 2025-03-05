public class MinNumLS{
    public static void main(String[] args) {
        int[] arr = {34, 53, 234, 23, 54, 23};
        System.out.println(minNum(arr));
    }

    static int minNum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}