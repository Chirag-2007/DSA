// 239. Sliding Window Maximum

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Question120 {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0, j = 0;
        while(j < n){
            // Step 1: Remove smaller elements from the back
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[j]){
                dq.pollLast();
            }
            // Step 2: Add current index
            dq.offerLast(j);
            // Step 3: Remove indices outside current window
            if(dq.peekFirst() < i){
                dq.pollFirst();
            }
            // Step 4: Window is not complete yet
            if(j - i + 1 < k){
                j++;
            }
            // Step 5: Window size is k
            else if(j - i + 1 == k){
                arr.add(nums[dq.peekFirst()]);
                i++;
                j++;
            }
        }
        int idx = 0;
        int[] ans = new int[arr.size()];
        for(int x : arr){
            ans[idx++] = x;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = maxSlidingWindow(nums, k);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
