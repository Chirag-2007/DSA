// 3701. Compute Alternating Sum

import java.util.Scanner;

public class Question115 {

    public static int alternatingSum(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                total += nums[i];
            }
            else{
                total -= nums[i];
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int ans = alternatingSum(nums);
        System.out.println(ans);
        sc.close();
    }
}