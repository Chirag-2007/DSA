// 203. Remove Linked List Elements

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

public class Question145 {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode(-1);
        ListNode node = ans;
        ListNode temp = head;
        while(temp != null){
            if(temp.val != val){
                node.next = temp;
                node = node.next;
            }
            temp = temp.next;
        }
        node.next = null;
        return ans.next;
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int val = 6;

        ListNode result = removeElements(head, val);

        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
