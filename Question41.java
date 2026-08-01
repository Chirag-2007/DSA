// Reverse String Prefix

import java.util.Scanner;

public class Question41 {

    public static String reversePrefix(String s, int k) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i = k - 1; i >= 0; i--){
            ans.append(s.charAt(i));
        }
        for(int i = k ; i < n; i++){
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String ans = reversePrefix(s, k);
        System.out.println(ans);
        sc.close();
    }
}