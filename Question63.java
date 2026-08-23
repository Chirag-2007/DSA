// 4014. Minimum Total Price After Applying Discounts

import java.util.Arrays;
import java.util.Scanner;

public class Question63 {

    public static double minPrice(int[] prices, int[] discounts) {
        int n1 = prices.length;
        int n2 = discounts.length;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double total = 0.0;
        int i = n1 - 1, j = n2 - 1;
        while(i >= 0){
            double val;
            if(j >= 0){
                val = prices[i] * (double)(100 - discounts[j]) / 100;
                j--;
            }
            else{
                val = prices[i];
            }
            total += val;
            i--;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] prices = new int[n1];
        for(int i = 0; i < n1; i++){
            prices[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] discounts = new int[n2];
        for(int i = 0; i < n2; i++){
            discounts[i] = sc.nextInt();
        }
        double ans = minPrice(prices, discounts);
        System.out.println(ans);
        sc.close();
    }
}
