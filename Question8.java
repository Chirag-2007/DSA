// Factorial of a given number

import java.util.Scanner;

public class Question8 {
    
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
        sc.close();
    }
}
