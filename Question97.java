// 3550. Smallest Index With Digit Sum Equal to Index

import java.util.Scanner;

public class Question97 {

    public static int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int total = 0;
            while(nums[i] > 0){
                total += nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
            if(total == i){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int ans = smallestIndex(nums);
        System.out.println(ans);
        sc.close();
    }
}
