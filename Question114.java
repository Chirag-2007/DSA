// 739. Daily Temperatures

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Question114 {

    public static ArrayList<Integer> nearestGreaterToRight(int[] temperatures){
        int n = temperatures.length;
        Stack<int[]> st = new Stack<>();
        ArrayList<Integer> right = new ArrayList<>();
        for(int i = n - 1; i >= 0; i--){
            if(st.size() == 0){
                right.add(-1);
            }
            else if(st.size() > 0 && st.peek()[0] > temperatures[i]){
                right.add(st.peek()[1]);
            }
            else if(st.size() > 0 && st.peek()[0] <= temperatures[i]){
                while(st.size() > 0 && st.peek()[0] <= temperatures[i]){
                    st.pop();
                }
                if(st.size() == 0){
                    right.add(-1);
                }
                else{
                    right.add(st.peek()[1]);
                }
            }
            st.push(new int[]{temperatures[i], i});
        }
        Collections.reverse(right);
        return right;
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        ArrayList<Integer> right = nearestGreaterToRight(temperatures);
        for(int i = 0; i < n; i++){
            if(right.get(i) == -1){
                ans[i] = 0;
            }
            else{
                ans[i] = right.get(i) - i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temperatures = new int[n];
        for(int i = 0; i < n; i++){
            temperatures[i] = sc.nextInt();
        }
        int[] ans = dailyTemperatures(temperatures);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
