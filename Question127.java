// 2409. Count Days Spent Together

import java.util.Scanner;

public class Question127 {

    public static int convert(String date){
        String[] arr = date.split("-");
        int month = Integer.parseInt(arr[0]);
        int day = Integer.parseInt(arr[1]);

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = 0;
        for(int i = 0; i < month - 1; i++){
            total += days[i];
        }
        return total + day;
    }

    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int arriveAliceDays = convert(arriveAlice);
        int leaveAliceDays = convert(leaveAlice);
        int arriveBobDays = convert(arriveBob);
        int leaveBobDays = convert(leaveBob);

        int arrive = Math.max(arriveAliceDays, arriveBobDays);
        int leave = Math.min(leaveAliceDays, leaveBobDays);

        if(arrive > leave){
            return 0;
        }
        return leave - arrive + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arriveAlice = sc.nextLine();
        String leaveAlice = sc.nextLine();
        String arriveBob = sc.nextLine();
        String leaveBob = sc.nextLine();
        int ans = countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob);
        System.out.println(ans);
        sc.close();
    }
}
