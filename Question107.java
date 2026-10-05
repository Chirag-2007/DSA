// 2037. Minimum Number of Moves to Seat Everyone

import java.util.Arrays;
import java.util.Scanner;

public class Question107 {

    public static int minMovesToSeat(int[] seats, int[] students) {
        int n = seats.length;
        Arrays.sort(seats);
        Arrays.sort(students);
        int mov = 0;
        for(int i = 0; i < n; i++){
            mov += Math.abs(students[i] - seats[i]);
        }
        return mov;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seats = new int[n];
        for(int i = 0; i < n; i++){
            seats[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] students = new int[m];
        for(int i = 0; i < n; i++){
            students[i] = sc.nextInt();
        }
        int ans = minMovesToSeat(seats, students);
        System.out.println(ans);
        sc.close();
    }
}
