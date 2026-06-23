// Palindrome Number

import java.util.Scanner;

public class Question2 {

    public static boolean isPalindrome(int x){
        int n = 0;
        int val = x;
        while(val > 0){
            int dig = val % 10;
            n = n*10 + dig;
            val = val / 10;
        }
        if(x == n){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        boolean ans = isPalindrome(res);
        if(ans == true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }   
}
