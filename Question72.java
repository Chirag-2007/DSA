// 3065. Minimum Operations to Exceed Threshold Value I

import java.util.Scanner;

public class Question72 {

    public static int minOperations(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] < k){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = minOperations(arr, k);
        System.out.println(ans);
        sc.close();
    }
}
