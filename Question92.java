// 231. Power of Two

import java.util.Scanner;

public class Question92 {

    public static boolean isPowerOfTwo(int n) {
        long pow = 1;
        if(n == 1) return true;
        while(true){
            pow = pow * 2;
            if(pow == n){
                return true;
            }
            else if(pow > n){
                break;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPowerOfTwo(n);
        System.out.println(ans);
        sc.close();
    }
}
