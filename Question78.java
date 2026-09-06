// 1331. Rank Transform of an Array

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Question78 {

    public static int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = 0; i < n; i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i], rank++);
            }
        }
        for(int i = 0; i < n; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = arrayRankTransform(arr);
        System.out.print("[");
        for(int i = 0; i < n; i++){
            if(i == n - 1){
                System.out.print(ans[i]);
            }
            else{
                System.out.print(ans[i] + ",");
            }
        }
        System.out.print("]");
        sc.close();
    }
}
