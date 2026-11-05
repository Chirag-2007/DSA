// 453. Minimum Moves to Equal Array Elements

import java.util.Scanner;

public class Question139 {

    public static int minMoves(int[] nums) {
        int n = nums.length;
        int steps = 0;
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            mini = Math.min(mini, nums[i]);
        }
        for(int i = 0; i < n; i++){
            if(nums[i] > mini){
                steps += nums[i] - mini;
            }
        }
        return steps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int ans = minMoves(nums);
        System.out.println(ans);
        sc.close();
    }
}
