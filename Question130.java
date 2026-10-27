// 876. Middle of the Linked List

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
         this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next; 
    }
}

public class Question130 {

    public static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        while (sc.hasNextInt()) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        ListNode mid = middleNode(head);

        while (mid != null) {
            System.out.print(mid.val + " ");
            mid = mid.next;
        }
        sc.close();
    }
}
