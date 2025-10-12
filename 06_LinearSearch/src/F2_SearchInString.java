

import java.util.Arrays;

public class F2_SearchInString {
    public static void main(String[] args) {
        String name = "Arun";
        char target = 'u';

        System.out.println(search(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                System.out.println("At index: "+ index);
                return true;
            }
        }
        return false;
    }
}
