// 290. Word Pattern

import java.util.HashMap;
import java.util.Scanner;

public class Question66 {

    public static boolean wordPattern(String pattern, String s) {
        int n1 = pattern.length();
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        String[] arr = s.split(" ");
        int n2 = arr.length;
        if(n1 != n2) return false;
        for(int i = 0; i < n1; i++){
            char ch = pattern.charAt(i);
            String word = arr[i];
            if(map1.containsKey(ch) && !map1.get(ch).equals(word)){
                return false;
            }
            if(map2.containsKey(word) && map2.get(word) != ch){
                return false;
            }
            map1.put(ch, word);
            map2.put(word, ch);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        String s = sc.nextLine();
        boolean ans = wordPattern(pattern, s);
        System.out.println(ans);
        sc.close();
    }
}
