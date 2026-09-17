// 409. Longest Palindrome

import java.util.HashMap;
import java.util.Scanner;

public class Question88 {

    public static int longestPalindrome(String s) {
        int n = s.length();
        if(n == 1) return n;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            char ch1 = s.charAt(i);
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
        }
        int total = 0;
        boolean hasOdd = false;
        for(char ch2 : map.keySet()){
            int freq = map.get(ch2);
            if(freq % 2 == 0){
                total += freq;
            }
            else if(freq % 2 != 0){
                total += freq - 1;
                hasOdd = true;
            }
        }
        if(hasOdd) return total + 1;
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = longestPalindrome(s);
        System.out.println(ans);
        sc.close();
    }
}
