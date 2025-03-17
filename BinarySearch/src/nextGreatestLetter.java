//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

//in this we don't return the mid instead of we need to find the char greater than the target char

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2; 
            if(target >= letters[mid] ){
                start = mid + 1; 
            }else 
                end = mid - 1;
        } return letters[start % letters.length]; // modulo because it wraps around and the zeroth index can be found with start % letters.length
    }
}