// First Negative Number in every Window of Size K
// Time Complexity: O(n), Space Complexity: O(k)

// Pattern: Fixed Size Sliding Window + Queue

// Step 1:
// Agar arr[j] negative hai to queue me add karo.
// Step 2:
// Jab tak window size < k hai, sirf j++ karo.
// Step 3:
// Jab window size == k ho:
// - Agar queue empty hai -> result me 0 add karo.
// - Warna queue ka front (peek) hi first negative hoga.
// Step 4:
// Window slide karne se pehle check karo:
// Agar arr[i] == queue.peek(), matlab first negative window se bahar ja raha hai,
// to queue se remove (poll) kar do.
// Step 5:
// Window slide karo -> i++, j++

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Question37 {

    public static List<Integer> firstNegInt(int arr[], int k){
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int i = 0, j = 0;
        while(j < n){
            if(arr[j] < 0){
                q.offer(arr[j]);
            }
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                if(q.isEmpty()){
                    result.add(0);
                }
                else{
                    result.add(q.peek());
                }
                if (!q.isEmpty() && arr[i] == q.peek()) {
                    q.poll();
                }
                i++;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        List<Integer> ans = firstNegInt(arr, k);
        System.out.println(ans);
        sc.close();
    }
}