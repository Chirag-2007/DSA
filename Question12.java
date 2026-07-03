// 	Linear Search

import java.util.Scanner;

public class Question12 {

    public static int search(int arr[], int x) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = search(arr, x);
        System.out.println(ans);
        sc.close();
    }
}
