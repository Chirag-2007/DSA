// Tower of Hanoi

// S (Source): Jahan initially saari plates hain.
// H (Helper): Temporary plates rakhne ke liye.
// D (Destination): Jahan saari plates pahunchani hain.

import java.util.Scanner;

public class Question155 {

    public static void solve(int s, int d, int h, int n){
        // Base condition
        if(n == 1){
            System.out.println("Move plate " + n + " from " + s + " to " + d);
            return;
        }
        // Hypothesis
        solve(s, h, d, n - 1);
        // Induction
        System.out.println("Move plate " + n + " from " + s + " to " + d);
        solve(h, d, s, n - 1);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        int h = 2;
        int d = 3;
        solve(s, d, h, n);
        sc.close();
    }
}
