// Find the number that appears once, and other numbers twice.

import java.util.Scanner;

public class Question23 {

    // Brute force solution
    // Time Complexity = O(n²), Space Complexity = O(1)
    public static int singleNumber(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            boolean unique = true;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j] && i != j){
                    unique = false;
                    break;
                }
            }
            if(unique == true) return arr[i];
        }
        return -1;
    }

    // Optimal solution (XOR = duplicate killer for this type of question.)
    // 1) Same number XOR karo → 0 (a ^ a = 0)
    // 2) Kisi bhi number ko 0 se XOR karo → wahi number (a ^ 0 = a)
    // Time Complexity: O(n), Space Complexity: O(1)
    public static int singleNumber1(int[] arr){
        int n = arr.length;
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = singleNumber1(arr);
        System.out.println(ans);
        sc.close();
    }
}
