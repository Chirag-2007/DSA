// 3498. Reverse Degree of a String

import java.util.Scanner;

public class Question58 {

    public static int reverseDegree(String s) {
        int n = s.length();
        int total = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            int val = 26 - (ch - 'a');
            total += val * (i + 1);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = reverseDegree(s);
        System.out.println(ans);
        sc.close();
    }
}
