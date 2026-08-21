// 1768. Merge Strings Alternately

import java.util.Scanner;

public class Question61 {

    public static String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(i < n1 && j < n2){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(j);
            sb.append(ch1);
            sb.append(ch2);
            i++;
            j++;
        }
        while(i < n1){
            char ch1 = word1.charAt(i);
            sb.append(ch1);
            i++;
        }
        while(j < n2){
            char ch2 = word2.charAt(j);
            sb.append(ch2);
            j++;
        }
        String str = new String(sb);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String ans = mergeAlternately(word1, word2);
        System.out.println(ans);
        sc.close();
    }
}
