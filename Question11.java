// 	Second Largest Element

import java.util.Scanner;

public class Question11{

    public static int getSecondLargest(int[] arr) {
        int n = arr.length;
        int first_max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(first_max < arr[i]){
                first_max = arr[i];
            }
        }
        int second_max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(second_max < arr[i] && arr[i] != first_max){
                second_max = arr[i];
            }
        }
        if(second_max == Integer.MIN_VALUE) return -1;
        return second_max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = getSecondLargest(arr);
        System.out.println(ans);
        sc.close();
    }
}