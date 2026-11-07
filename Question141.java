// 138. Copy List with Random Pointer

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Question141 {

    public static Node copyRandomList(Node head) {
        if(head == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head;
        // Create cloned nodes
        while(temp != null){
            Node node = new Node(temp.val);
            map.put(temp, node);
            temp = temp.next;
        }
        temp = head;
        // Connect pointers
        while(temp != null){
            Node n1 = map.get(temp);
            Node n2 = map.get(temp.next);
            n1.next = n2; // next
            Node n3 = map.get(temp.random);
            n1.random = n3; // random
            temp = temp.next;
        }
        return map.get(head);
    }
    public static void main(String[] args) {
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        Node copy = copyRandomList(n1);

        Node temp = copy;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
