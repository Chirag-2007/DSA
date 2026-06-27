// 	GCD of Two Numbers

import java.util.Scanner;

public class Question6 {

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = gcd(a, b);
        System.out.println(ans);
        sc.close();
    }
}
