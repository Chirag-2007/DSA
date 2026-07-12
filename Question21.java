// Majority Element-I

import java.util.Scanner;

public class Question21 {
    // Time Complexity = O(n²), Space Complexity = O(1)
    public static int majorityElement(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > n / 2) return arr[i];
        }
        return -1;
    }
    
    // Moore's Voting Algorithm
    // TC = O(n), SC = O(1)
    public static int majorityElement1(int[] arr){
        int n = arr.length;
        int elm = arr[0];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                elm = arr[i];
            }
            if(elm == arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return elm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = majorityElement1(arr);
        System.out.println(ans);
        sc.close();
    }
}