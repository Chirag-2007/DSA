// Stock Buy and Sell

import java.util.Scanner;

public class Question26 {

    // Brute force solution
    // Time Complexity: O(n²), Space Complexity: O(1)
    public static int maxProfit(int[] arr){
        int n = arr.length;
        int maxProfit = 0;
        for(int i = 0; i < n; i++){
            int buyStock = arr[i];
            for(int j = i + 1; j < n; j++){
                int sellStock = arr[j];
                int profitStock = sellStock - buyStock;
                maxProfit = Math.max(maxProfit, profitStock);
            }
        }
        return maxProfit;
    }

    // Optimal solution
    // Time Complexity = O(n), Space Complexity = O(1)

    // (1) minPrice me ab tak ka sabse kam stock price store karte hain.
    // (2) Array ko sirf ek baar left se right traverse karte hain.
    // (3) Agar current price minPrice se chhota ho, to minPrice update kar dete hain.
    // (4) Warna current price par sell karke profit = currentPrice - minPrice nikalte hain.
    // (5) Agar ye profit pehle wale maxProfit se zyada ho, to maxProfit update kar dete hain.
    // (6) Traversal ke end me maxProfit hi answer hota hai.

    public static int maxProfit1(int[] arr){
        int n = arr.length;
        int minPrice = arr[0];
        int maxProfit = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }
            else{
                int profit = arr[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = maxProfit1(arr);
        System.out.println(ans);
        sc.close();
    }
}