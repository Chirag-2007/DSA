// Duplicate Zeros

import java.util.Scanner;

public class Question43 {

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] num = new int[n];
        int i = 0, j = 0;
        while(i < n){
            num[i] = arr[j];
            if(num[i] == 0 && i < n - 1){
                i++;
                num[i] = 0;
            }
            i++;
            j++;
        }
        for(int k = 0; k < n; k++){
            arr[k] = num[k];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        duplicateZeros(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
