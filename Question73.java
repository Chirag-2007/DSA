// 1207. Unique Number of Occurrences

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Question73 {

    public static boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        if(map.size() == set.size()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = uniqueOccurrences(arr);
        System.out.println(ans);
        sc.close();
    }
}
