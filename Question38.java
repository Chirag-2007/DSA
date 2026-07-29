// LC424 – Longest Repeating Character Replacement
// Time Complexity: O(n), Space Complexity: O(k), k = distinct characters

// Pattern: Variable Sliding Window

// left  -> shrink window
// right -> expand window
// Add current character into HashMap
// Update maxFreq = maximum frequency inside the window
// Invalid window: (windowLength - maxFreq) > k
// Shrink: decrease frequency, if frequency becomes 0 -> remove character, left++
// Valid window: update answer
// Important Interview Trick: maxFreq is NEVER decreased while shrinking.

import java.util.HashMap;
import java.util.Scanner;

public class Question38 {

    public static int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0, right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int ans = 0;
        while(right < n){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(ch));
            while((right - left + 1) - maxFreq > k){
                char ch1 = s.charAt(left);
                map.put(ch1, map.get(ch1) - 1);
                if(map.get(ch1) == 0){
                    map.remove(ch1);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        int ans = characterReplacement(s, k);
        System.out.println(ans);
        sc.close();
    }
}