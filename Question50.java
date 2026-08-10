// 3345. Smallest Divisible Digit Product I

import java.util.Scanner;

public class Question50 {

    public static int prd(int n){
        int prd = 1;
        while(n > 0){
            int last = n % 10;
            prd = prd * last;
            n = n / 10;
        }
        return prd;
    }

    public static int smallestNumber(int n, int t) {
        int res = prd(n);
        if(res % t == 0){
            return n;
        }
        else{
            while(res % t != 0){
                n = n + 1;
                res = prd(n);
                if(res % t == 0){
                    return n;
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int ans = smallestNumber(n, t);
        System.out.println(ans);
        sc.close();
    }
}
