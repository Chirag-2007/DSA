// 2540. Minimum Common Value

import java.util.HashMap;
import java.util.Scanner;

public class Question95 {

    public static int getCommon(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int minElm = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n1; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for(int i = 0; i < n2; i++){
            if(map.containsKey(nums2[i])){
                minElm = Math.min(minElm, nums2[i]);
            }
        }
        if(minElm == Integer.MAX_VALUE) return -1;
        return minElm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for(int i = 0; i < n1; i++){
            nums1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for(int i = 0; i < n1; i++){
            nums2[i] = sc.nextInt();
        }
        int ans = getCommon(nums1, nums2);
        System.out.println(ans);
        sc.close();
    }
}
