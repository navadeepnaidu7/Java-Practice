import java.util.*;
public class SwapArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //input
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        swap(arr, 0,1);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
