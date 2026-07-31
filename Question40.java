// Maximum Gap

import java.util.Arrays;
import java.util.Scanner;

public class Question40 {

    public static int maximumGap(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int maxDiff = Integer.MIN_VALUE;
        if(n < 2){
            return 0;
        }
        else{
            int i = 0;
            int ans = 0;
            while(i + 1 < n){
                if(arr[i + 1] > arr[i]){
                    ans = arr[i + 1] - arr[i];
                }
                maxDiff = Math.max(maxDiff, ans);
                i++;
            }
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = maximumGap(arr);
        System.out.println(ans);
        sc.close();
    }
}