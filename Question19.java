// Union of two sorted arrays

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Question19 {

    // Brute/Better (HashSet + Sort)
    // TC -> O(n + m + k log k), SC -> O(k)

    public static ArrayList<Integer> findUnion(int a[], int b[]){
        int n1 = a.length;
        int n2 = b.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n1; i++){
            set.add(a[i]);
        }
        for(int i = 0; i < n2; i++){
            set.add(b[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
    
    // Optimise (Two pointers)
    // TC -> O(n + m), Auxiliary Space: O(1), SC -> O(n + m)

    public static ArrayList<Integer> findUnion1(int a[], int b[]){
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i < n && j < m){
            while((i + 1) < n && a[i] == a[i + 1]){
                i++;
            }
            while((j + 1) < m && b[j] == b[j + 1]){
                j++;
            }
            if(a[i] < b[j]){
                ans.add(a[i]);
                i++;
            }
            else if(a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else{
                ans.add(b[j]);
                j++;
            }
        }
        while(i < n){
            while((i + 1) < n && a[i] == a[i + 1]){
                i++;
            }
            ans.add(a[i]);
            i++;
        }
        while(j < m){
            while((j + 1) < m && b[j] == b[j + 1]){
                j++;
            }
            ans.add(b[j]);
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = findUnion1(a, b);
        int len = ans.size();
        for(int i = 0; i < len; i++){
            System.out.print(ans.get(i) + " ");
        }
        sc.close();
    }
}