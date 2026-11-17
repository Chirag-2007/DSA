// Kth Symbol in Grammar

import java.util.Scanner;

public class Question151 {

    public static int kthGrammar(int n, int k) {
        if(n == 1 && k == 1){
            return 0;
        }
        double length = Math.pow(2, n - 1);
        int mid = (int)length / 2;
        if(k <= mid){
            return kthGrammar(n - 1, k);
        } 
        else{
            return 1 - kthGrammar(n - 1, k - mid);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = kthGrammar(n, k);
        System.out.println("Kth Symbol: " + result);
        sc.close();
    }
}
