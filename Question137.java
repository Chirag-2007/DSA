// 3736. Minimum Moves to Equal Array Elements III

import java.util.Scanner;

public class Question137 {

    public static int minMoves(int[] nums) {
        int n = nums.length;
        int steps = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);
        }
        for(int i = 0; i < n; i++){
            steps += max - nums[i];
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
