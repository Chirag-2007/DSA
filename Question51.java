// 387. First Unique Character in a String

import java.util.HashMap;
import java.util.Scanner;

public class Question51 {

    public static int firstUniqChar(String s){
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < n; i++){
            char ch1 = s.charAt(i);
            if(map.get(ch1) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = firstUniqChar(s);
        System.out.println(ans);
        sc.close();
    }
}
