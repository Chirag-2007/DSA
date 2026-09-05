// 2460. Apply Operations to an Array

import java.util.Scanner;

public class Question76 {

    public static int[] applyOperations(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i < n - 1){
            if(arr[i] == arr[i + 1]){
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
                i++;
            }
            i++;
        }
        i = 0;
        int j = 0;
        while(j < n){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = applyOperations(arr);
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
