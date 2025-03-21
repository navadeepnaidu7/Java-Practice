import java.util.*;
public class MaxElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //input
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxArray(arr, 0,1));

    }

    public static int maxArray(int[] arr, int start, int end){
        int maxVal = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
