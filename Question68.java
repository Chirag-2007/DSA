// 2996. Smallest Missing Integer Greater Than Sequential Prefix Sum
// Time Complexity: O(n), Space Complexity: O(n)

import java.util.HashSet;
import java.util.Scanner;

public class Question68 {

    public static int missingInteger(int[] arr){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        int i = 1;
        int total = arr[0];
        while(i < n && arr[i] == arr[i - 1] + 1){
            total += arr[i];
            i++;
        }
        while(set.contains(total)){
            total++;
        }
        return total;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = missingInteger(arr);
        System.out.println(ans);
       sc.close(); 
    }
}
