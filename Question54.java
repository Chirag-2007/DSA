// 3760. Maximum Substrings With Distinct Start

import java.util.Scanner;

public class Question54 {

    public static int maxDistinct(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = maxDistinct(s);
        System.out.println(ans);
        sc.close();
    }
}
