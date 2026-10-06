// 1952. Three Divisors

import java.util.Scanner;

public class Question108 {

    public static boolean isThree(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 3) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isThree(n);
        System.out.println(ans);
        sc.close();
    }
}
