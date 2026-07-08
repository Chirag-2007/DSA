// 	Remove duplicates from Sorted array

// Time Complexity: O(n), Space Complexity: O(1)

import java.util.Scanner;

public class Question17 {

    public static int removeDuplicates(int[] arr){
        int n = arr.length;
        int ans = arr[0];
        int k = 1;
        for(int i = 1; i < n; i++){
            if(ans == arr[i]){
                continue;
            }
            else{
                arr[k] = arr[i];
                ans = arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = removeDuplicates(arr);
        System.out.print("[");
        for(int i = 0; i < k; i++){
            if(i == k - 1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
        sc.close();
    }
}
