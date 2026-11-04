// 143. Reorder List
// Time complexity: O(n), Space complexity: O(1)

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

public class Question138 {

    public static void reorderList1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // Middle Element
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // Seperate the 2 half
        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode next = null;
        // Reverse the second half
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Merging 2 seperate half
        ListNode first = head;
        ListNode second = prev;
        while(first != null && second != null){
            ListNode next1 = first.next;
            ListNode next2 = second.next;
            first.next = second;
            second.next = next1;
            first = next1;
            second = next2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        reorderList1(head);

        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        sc.close();
    }
}
