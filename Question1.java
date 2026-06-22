// Count Digits in a Number

import java.util.Scanner;

public class Question1{

    public static int countDigits(int n){
        int count = 0;
        if(n == 0){
            return 1;
        }
        while(n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        System.out.println(countDigits(res));
        sc.close();
    }
}