// 1991. Find the Middle Index in Array

import java.util.Scanner;

public class Question89 {

    public static int findMiddleIndex(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for(int i = 0; i < n; i++){
            totalSum += arr[i];
        }
        int leftSum = 0;
        for(int i = 0; i < n; i++){
            int rightSum = totalSum - arr[i] - leftSum;
            if(leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findMiddleIndex(arr);
        System.out.println(ans);
        sc.close();
    }
}
