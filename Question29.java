// Valid Palindrome
// Time Complexity: O(n), Space Complexity: O(1)

// Ignore all non-alphanumeric characters.
// Alphanumeric = Alphabet + Numeric (A-Z, a-z, 0-9)

// String ma particular character ke liya s.charAt() ya wala syntax lagta h.
// Character.isLetterOrDigit() to check ki only digit and letter me se hone chaiya bs.
// Character.toLowerCase() lowercase ma covert krne ke liya.

// Two-pointers -->

// Two pointers from both ends.
// Ignore non-alphanumeric characters.
// Compare characters after converting both to lowercase.
// If any mismatch occurs, return false.

import java.util.Scanner;

public class Question29 {

    public static boolean isPalindrome(String s){
        int n = s.length();
        int i = 0;
        int j = n - 1;
        while(i < j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(!Character.isLetterOrDigit(left)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                j--;
                continue;
            }
            left = Character.toLowerCase(left);
            right = Character.toLowerCase(right);
            if(left != right){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean ans = isPalindrome(s);
        System.out.println(ans);
        sc.close();
    }
}