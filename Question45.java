// Valid Anagram

import java.util.HashMap;
import java.util.Scanner;

public class Question45 {

    public static boolean isAnagram(String s, String t){
            HashMap<Character, Integer> map = new HashMap<>();
            int n = s.length();
            if(s.length() != t.length()) return false;
            for(int i = 0; i < n; i++){
                char ch1 = s.charAt(i);
                map.put(ch1, map.getOrDefault(ch1, 0) + 1);
            }
            for(int j = 0; j < n; j++){
                char ch2 = t.charAt(j);
                if(map.containsKey(ch2)){
                    map.put(ch2, map.get(ch2) - 1);
                    if(map.get(ch2) == 0){
                        map.remove(ch2);
                    }
                }
            }
            if(map.size() == 0){
                return true;
            }
            return false;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean ans = isAnagram(s, t);
        System.out.println(ans);
        sc.close();
    }
}
