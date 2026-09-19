// 350. Intersection of Two Arrays II

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Question90 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n1; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for(int i = 0; i < n2; i++){
            if(map.containsKey(nums2[i])){
                arr.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
                if(map.get(nums2[i]) == 0){
                    map.remove(nums2[i]);
                }
            }
        }
        int[] ans = new int[arr.size()];
        int i = 0;
        for(int x : arr){
            ans[i] = x;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for(int i = 0; i < n; i++){
            nums1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] nums2 = new int[n];
        for(int i = 0; i < m; i++){
            nums2[i] = sc.nextInt();
        }
        int[] ans = intersect(nums1, nums2);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
