// 203. Remove Linked List Elements

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

public class Question143 {

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
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ListNode newNode = new ListNode(x);
            if(head == null){
                head = newNode;
                tail = newNode;
            } 
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        int val = sc.nextInt();

        head = removeElements(head, val);

        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        sc.close();
    }
}
