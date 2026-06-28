// 	Reverse a number

import java.util.Scanner;

public class Question7 {

    public static int reverse(int x){
        int val  = 1;
        if(x < 0){
            val = -1;
        }
        int num = Math.abs(x);
        int rev = 0;
        while(num > 0){
            int last = num % 10;
            if((rev < Integer.MIN_VALUE/10) || (rev > Integer.MAX_VALUE/10)){
                return 0;
            }
            rev = rev * 10 + last;
            num = num / 10;
        } 
        return val * rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = reverse(num);
        System.out.println(ans);
        sc.close();
    }
}
