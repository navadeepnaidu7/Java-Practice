import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        // input 
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
           nums[i] = sc.nextInt();
        }
        System.out.println("enter target:");

        int target = sc.nextInt();
        //output
        System.out.println(LinearSearchAlgo(nums, target));
        sc.close();
    }
    
     static  int LinearSearchAlgo(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }


        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            
            if(element == target){
                return index;
            }
        }

        return -1;
}
}
