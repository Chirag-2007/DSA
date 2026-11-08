// 2390. Removing Stars From a String

import java.util.Scanner;

public class Question142 {

    public static String removeStars(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = removeStars(s);
        System.out.println(ans);
        sc.close();
    }
}
