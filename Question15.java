// Move Zeros to End

import java.util.Scanner;

public class Question15 {
    
    public static void moveZeroes(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = 0;
        while(j < n){
            if(arr[j] != 0){
                arr[i] = arr[j];
                i++;
            }
            j++;
        }
        while(i < n){
            arr[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
}
