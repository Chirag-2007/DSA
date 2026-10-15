// 2913. Subarrays Distinct Element Sum of Squares I

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Question117 {

    public static int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int total = 0;
        for(int i = 0; i < n; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j < n; j++){
                set.add(nums.get(j));
                total += (set.size() * set.size());
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        int ans = sumCounts(arr);
        System.out.println(ans);
        sc.close();
    }
}
