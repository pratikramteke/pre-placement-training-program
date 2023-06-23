package linkedlist;

public class ReverseDoublyLL {
    static Node head;
    static class Node {
        int val;
        Node next, prev;

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

    static void reverse(){
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if(temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        ReverseDoublyLL list = new ReverseDoublyLL();
        list.push(2);
        list.push(4);
        list.push(8);
        list.push(10);
        display(head);
        reverse();
        display(head);
    }
}
