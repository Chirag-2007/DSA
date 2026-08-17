// 905. Sort Array By Parity

import java.util.Scanner;

public class Question57 {

    public static int[] sortArrayByParity(int[] arr){
        int n = arr.length;
        if(n == 1) return arr;
        int i = 0, j = n - 1;
        while(i < j){
            if(arr[i] % 2 != 0 && arr[j] % 2 == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i] % 2 == 0){
                i++;
            }
            if(arr[j] % 2 != 0){
                j--;
            }
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
        int[] ans = sortArrayByParity(arr);
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
