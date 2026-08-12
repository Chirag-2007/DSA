// 2351. First Letter to Appear Twice

import java.util.Scanner;

public class Question52 {

    public static char repeatedCharacter(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            if(freq[ch - 'a'] >= 2){
                return ch;
            }
        }
        return 'a';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = repeatedCharacter(s);
        System.out.println(ch);
        sc.close();
    }
}
