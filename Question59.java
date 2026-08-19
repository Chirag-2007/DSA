// 896. Monotonic Array

import java.util.Scanner;

public class Question59 {

    public static boolean isMonotonic(int[] arr){
        int n = arr.length;
        boolean flag = true;
        if(n == 1) return flag;
        int i = 0;
        if(arr[i] <= arr[i + 1]){
            while(i < n - 1 && arr[i] <= arr[i + 1]){
                i++;
            }
            if(i != n - 1){
                flag = false;
            }
            else{
                return true;
            }
        }
        i = 0;
        if(arr[i] >= arr[i + 1]){
            while(i < n - 1 && arr[i] >= arr[i + 1]){
                i++;
            }
            if(i != n - 1){
                flag = false;
            }
            else{
                return true;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = isMonotonic(arr);
        System.out.println(ans);
        sc.close();
    }
}
