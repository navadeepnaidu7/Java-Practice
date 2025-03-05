public class SearchInRange{
    public static void main(String[] args) {
        int[] arr = {34, 53, 234, 23, 54, 23};
        int target = 234;
        System.out.println(Search(arr, target, 0, 3));        
    }

     static int Search(int[] arr, int target, int start, int end) {
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }


}