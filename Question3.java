// Check if the Number is Armstrong

import java.util.Scanner;

public class Question3 {

    public static boolean armstrongNumber(int n) {
        int count = 0;
        int val = n;
        int num = n;
        while(val > 0){
            count++;
            val = val / 10;
        }
        int armstrong_num = 0;
        while(num > 0){
            int last = num % 10;
            armstrong_num += (int)Math.pow(last, count);
            num = num / 10;
        }
        if(armstrong_num == n) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = armstrongNumber(n);
        if(ans == true){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
        sc.close();
    }
}
