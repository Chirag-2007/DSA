// 345. Reverse Vowels of a String

import java.util.Scanner;

public class Question49 {
    
    private static boolean isVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        return true;
        }
        return false;
    }

    public static String reverseVowels(String s){
        int n = s.length();
        char[] ch = s.toCharArray();
        int i = 0, j = n - 1;
        while(i < j){
            while (i < j && !isVowel(ch[i])){
                i++;
            }
            while (i < j && !isVowel(ch[j])){
                j--;
            }
            if(i < j){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        String ans = new String(ch);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = reverseVowels(s);
        System.out.println(ans);
        sc.close();
    }
}
