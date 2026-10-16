// 27. Remove Element

import java.util.Scanner;

public class Question118 {

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0, j = 0;
        while(j < n){
            if(nums[j] != val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        int ans = removeElement(nums, val);
        System.out.println(ans);
        sc.close();
    }
}
