// Two Sum

import java.util.Scanner;

public class Question16 {

    public static int[] twoSum(int[] arr, int target){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] + arr[j] == target && i != j){
                    int[] ans = {i, j};
                    return ans;
                }
            }
        }
        int[] ans = {};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = twoSum(arr, target);
        System.out.println("[" + ans[0] + "," + ans[1] + "]");
        sc.close();
    }
}
