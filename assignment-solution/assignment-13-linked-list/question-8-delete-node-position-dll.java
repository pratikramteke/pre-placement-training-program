package linkedlist;

public class DeleteNodePositionDLL {
    static Node head;
    private static class Node {
        private int val;
        private Node next, prev;

        Node(int val) {
            this.val = val;
            next = prev = null;
        }
    }
    static void push(int val){
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    static void display(Node node){
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }
    static void deleteNode(int position) {
        Node current = head;
        if(head == null || position <= 0) {
            return;
        }
        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }
        if(current == null) {
            return;
        }
        if(head == current) {
            head = current.next;
        }
        if(current.next != null){
            current.prev.next = current.next;
        }
        current = null;
    }
    public static void main(String[] args) {
        DeleteNodePositionDLL list = new DeleteNodePositionDLL();
        list.push(2);
        list.push(4);
        list.push(8);
        list.push(10);
        display(head);
        deleteNode(3);
        display(head);
    }
}
