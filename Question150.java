// 206. Reverse Linked List

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

public class Question150 {

    public static ListNode reverseList(ListNode head) {
        // Base Condition
        if(head == null || head.next == null){
            return head;
        }
        // Hypothesis
        ListNode newHead = reverseList(head.next);
        // Induction
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = reverseList(head);

        ListNode temp = head;

        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
