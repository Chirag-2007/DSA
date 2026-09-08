// 1480. Running Sum of 1d Array

import java.util.Scanner;

public class Question79 {

    public static int[] runningSum(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = runningSum(arr);
        System.out.print("[");
        for(int i = 0; i < n; i++){
            if(i == n - 1){
                System.out.print(ans[i]);
            }
            else{
                System.out.print(ans[i] + ",");
            }
        }
        System.out.print("]");
        sc.close();
    }
}
