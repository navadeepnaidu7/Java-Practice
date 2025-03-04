import java.util.*;

public class StringsLinearSearch {
    public static void main(String[] args) {

        String name = "navadeep";
        char target = 'p';
        System.out.println(StringLS(name, target));

    }

    static boolean StringLS(String str, char target) {
        

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    // this code can also be written with for each loop
    static boolean StringLS2(String str, char target){
        for (char ch:
             str.toCharArray()) {
                if (ch == target){
                    return  true;
                }
        }
        return false;
    }
}
