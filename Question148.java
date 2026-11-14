// Sort An array

import java.util.ArrayList;
import java.util.Scanner;

public class Question148 {

    public static void insert(ArrayList<Integer> arr, int temp){
        int n = arr.size();

        // Base Condition
        if(n == 0 || arr.get(n - 1) <= temp){
            arr.add(temp);
            return;
        }

        // Hypothesis
        int val = arr.get(n - 1);
        arr.remove(n - 1);

        insert(arr, temp);

        // Induction
        arr.add(val);
    }

    public static void sort(ArrayList<Integer> arr){
        int n = arr.size();

        // Base Condition
        if(n == 0 || n == 1){
            return;
        }

        // Hypothesis
        int temp = arr.get(n - 1);
        arr.remove(n - 1);
        sort(arr);

        // Induction
        insert(arr, temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Original Array: " + arr);
        sort(arr);
        System.out.println("Sorted Array: " + arr);
        sc.close();
    }
}