// 4020. Elevator Requests I

import java.util.Scanner;

public class Question119 {

    public static int elevatorRequests(int n, int[] requests) {
        int size = requests.length;
        int total = requests[0];
        for(int i = 1; i < size; i++){
            total += Math.abs(requests[i] - requests[i - 1]);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] requests = new int[n];
        for(int i = 0; i < n; i++){
            requests[i] = sc.nextInt();
        }
        int ans = elevatorRequests(n, requests);
        System.out.println(ans);
        sc.close();
    }
}
