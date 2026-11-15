// 344. Reverse String

import java.util.Scanner;

public class Question149 {

    public static void reverse(char[] s, int left, int right){
        // Base Condition
        if(left >= right){
            return;
        }
        // Induction
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        // Hypothesis
        reverse(s, left + 1, right - 1);
    }

    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        reverse(s, left, right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = new char[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.next().charAt(0);
        }
        reverseString(s);
        for(int i = 0; i < n; i++){
            System.out.print(s[i] + " ");
        }
        sc.close();
    }
}
