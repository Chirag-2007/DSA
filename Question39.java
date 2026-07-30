// Maximum Product of Two Elements in an Array

import java.util.Scanner;

public class Question39 {

    public static int maxProduct(int[] arr){
        int n = arr.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2){
                max2 = arr[i];
            }
        }
        int ans = (max1 - 1) * (max2 - 1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = maxProduct(arr);
        System.out.println(ans);
        sc.close();
    }
}