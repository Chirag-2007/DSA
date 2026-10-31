// 19. Remove Nth Node From End of List
// Time complexity: O(n), Space complexity: O(1)

// Create slow and fast pointer.
// Move fast pointer n steps.
// If fast == null, nth node is the head, so return head.next.
// Move slow and fast pointer one step until fast.next == null.
// Delete the required node using slow.next = slow.next.next.
// return head.

import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val; 
    }
    ListNode(int val, ListNode next){ 
        this.val = val; this.next = next;
    }
}

public class Question134 {

    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode temp1 = head;
        ListNode curr = head;
        ListNode temp2 = curr;
        int cnt = 0;
        while(temp1 != null){
            cnt++;
            temp1 = temp1.next;
        }
        int total = cnt;
        if(n == total){
            return temp2.next;
        }
        else if(cnt == total){
            int num = cnt - n;
            cnt = 0;
            while(cnt < num - 1){
                cnt++;
                temp2 = temp2.next;
            }
            temp2.next = temp2.next.next;
        }
        return curr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for(int i = 1; i < n; i++){
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }
        int k = sc.nextInt();
        head = removeNthFromEnd1(head, k);
        temp = head;

        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        sc.close();
    }
}
