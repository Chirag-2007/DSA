// 	Check for Prime Number

import java.util.Scanner;

public class Question4 {

    public static boolean isPrime(int n){
        int prime = 1;
        if(n <= 1){
            prime = 0;
        }
        else{
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    prime = 0;
                    break;
                }
            }
        }
        if(prime == 1) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        if(ans == true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
        sc.close();
    }
}
