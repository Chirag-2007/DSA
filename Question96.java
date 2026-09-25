// 1534. Count Good Triplets

import java.util.Scanner;

public class Question96 {

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(Math.abs(arr[i] - arr[j]) <= a){
                    for(int k = j + 1; k < n; k++){
                        if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                        count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = countGoodTriplets(arr, a, b, c);
        System.out.println(ans);
        sc.close();
    }
}