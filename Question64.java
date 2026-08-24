// 1160. Find Words That Can Be Formed by Characters

import java.util.Scanner;

public class Question64 {

    public static int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];
        char[] ch = chars.toCharArray();
        int n1 = ch.length;
        for(int i = 0; i < n1; i++){
            charCount[ch[i] - 'a']++;
        }
        int n2 = words.length;
        int result = 0;
        for(int i = 0; i < n2; i++){
            int[] wordCount = new int[26];
            char[] word = words[i].toCharArray();
            for(int j = 0; j < words[i].length(); j++){
                wordCount[word[j] - 'a']++;
            }
            boolean canForm = true;
            for(int k = 0; k < 26; k++){
                if(wordCount[k] > charCount[k]){
                    canForm = false;
                    break;
                }
            }
            if(canForm){
                result += words[i].length();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i = 0; i < n; i++){
            words[i] = sc.nextLine();
        }
        String chars = sc.nextLine();
        int ans = countCharacters(words, chars);
        System.out.println(ans);
        sc.close();
    }
}
