// 234. Palindrome Linked List

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

public class Question135 {

    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // Middle node in the Linked List
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // Reverse the second half
        ListNode prev = null;
        ListNode curr = slow;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
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
        System.out.println(isPalindrome(head));
        sc.close();
    }
}
