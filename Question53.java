// 389. Find the Difference

import java.util.Scanner;

public class Question53 {

    public static char findTheDifference(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int[] freq = new int[26];
        for(int i = 0; i < n2; i++){
            char ch = t.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i = 0; i < n1; i++){
            char ch = s.charAt(i);
            freq[ch - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(freq[i] == 1){
                return (char)(i + 'a');
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        char ch = findTheDifference(s, t);
        System.out.println(ch);
        sc.close();
    }
}
