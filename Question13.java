// Find missing number

import java.util.Scanner;

public class Question13 {

    public static int missingNum(int arr[]){
        int n = arr.length;
        int total = 0;
        for(int i = 0; i < n; i++){
            total += arr[i];
        }
        n = n + 1;
        long sum = (long)n * (n + 1) / 2;
        int missing = (int)sum - total;
        return missing;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int res = missingNum(arr);
        System.out.println(res);
        sc.close();
    }
}
