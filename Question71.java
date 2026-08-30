// 3090. Maximum Length Substring With Two Occurrences

import java.util.HashMap;
import java.util.Scanner;

public class Question71 {

    public static int maximumLengthSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        while(j < n){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if(map.get(ch) > 2){
                while(map.get(ch) > 2){
                    char ch2 = s.charAt(i);
                    map.put(ch2, map.get(ch2) - 1);
                    i++;
                }
            }
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = maximumLengthSubstring(s);
        System.out.println(ans);
        sc.close();
    }
}
