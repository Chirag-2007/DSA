// 3110. Score of a String

import java.util.Scanner;

public class Question55 {

    public static int scoreOfString(String s) {
        int n = s.length();
        int total = 0;
        for(int i = 0; i < n - 1; i++){
            total += Math.abs(s.charAt(i + 1) - s.charAt(i));
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = scoreOfString(s);
        System.out.println(ans);
        sc.close();
    }
}
