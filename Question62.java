// 520. Detect Capital

import java.util.Scanner;

public class Question62 {

    public static boolean detectCapitalUse(String word) {
        int n = word.length();
        int upper = 0;
        int lower = 0;
        for(int i = 0; i < n; i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            }
            else if(Character.isLowerCase(ch)){
                lower++;
            }
        }
        int lower_rest = 0;
        for(int i = 1; i < n; i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                lower_rest++;
            }
        }
        if(upper == n){
            return true;
        }
        if(lower == n){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0)) && lower_rest == n - 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean ans = detectCapitalUse(word);
        System.out.println(ans);
        sc.close();
    }
}
