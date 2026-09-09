// 455. Assign Cookies

import java.util.Arrays;
import java.util.Scanner;

public class Question80 {

    public static int findContentChildren(int[] g, int[] s) {
        int n1 = g.length;
        int n2 = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        int count = 0;
        while(i < n1 && j < n2){
            if(s[j] >= g[i]){
                count++;
                i++;
                j++;
            }
            else if(s[j] < g[i]){
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] g = new int[n];
        for(int i = 0; i < n; i++){
            g[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] s = new int[m];
        for(int i = 0; i < m; i++){
            s[i] = sc.nextInt();
        }
        int ans = findContentChildren(g, s);
        System.out.println(ans);
        sc.close();
    }
}
