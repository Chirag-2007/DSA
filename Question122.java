// 1672. Richest Customer Wealth

import java.util.Scanner;

public class Question122 {

    public static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int maxAmount = Integer.MIN_VALUE;
        for(int i = 0; i < m; i++){
            int total = 0;
            for(int j = 0; j < n; j++){
                total += accounts[i][j];
            }
            if(maxAmount < total){
                maxAmount = total;
            }
        }
        return maxAmount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                accounts[i][j] = sc.nextInt();
            }
        }
        int ans = maximumWealth(accounts);
        System.out.println(ans);
        sc.close();
    }
}
