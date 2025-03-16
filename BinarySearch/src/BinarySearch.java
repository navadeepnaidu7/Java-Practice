class BinarySearch{

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 9, 12, 19, 21, 26, 33, 55, 77, 81};
        int target = 1;
        int ans = binaryAlgo(nums, target);
        System.out.println(ans);
    }

    static int binaryAlgo(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}