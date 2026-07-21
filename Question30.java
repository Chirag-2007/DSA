// Is Subsequence
// Time Complexity: O(n), Space Complexity: O(1)

// sequence - saare character s string ke sequence ma with gap chalega but un-ordered nhi hone chaiya and aane chaiya t string ma.

import java.util.Scanner;

public class Question30 {

    public static boolean isSubsequence(String s, String t){
        int len = t.length();
        int len_s = s.length();
        if(len_s == 0) return true;
        int i = 0;
        for(int j = 0; j < len; j++){
            if(i == len_s) return true;
            char ch_s = s.charAt(i);
            char ch_t = t.charAt(j);
            if(ch_s == ch_t){
                i++;
            }
        }
        if(i <= (len_s - 1)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean ans = isSubsequence(s, t);
        System.out.println(ans);
        sc.close();
    }
}
