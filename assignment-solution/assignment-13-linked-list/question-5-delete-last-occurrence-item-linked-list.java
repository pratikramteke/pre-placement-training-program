public class DeleteLastOccurrenceItemFromLinkedList {
    static class Node {
        int data;
        Node next;
    }
    static void deleteLast(Node head, int x)
    {
        Node temp = head, ptr = null;
        while (temp!=null)
        {
            if (temp.data == x)
                ptr = temp;
            temp = temp.next;
        }
        if (ptr != null && ptr.next == null)
        {
            temp = head;
            while (temp.next != ptr)
                temp = temp.next;
            temp.next = null;
        }
        if (ptr != null && ptr.next != null)
        {
            ptr.data = ptr.next.data;
            temp = ptr.next;
            ptr.next = ptr.next.next;
            System.gc();
        }
    }
    static Node newNode(int x)
    {
        Node node = new Node();
        node.data = x;
        node.next = null;
        return node;
    }
    static void display(Node head)
    {
        Node temp = head;
        if (head == null)
        {
            System.out.print("null\n");
            return;
        }
        while (temp != null)
        {
            System.out.printf("%d --> ", temp.data);
            temp = temp.next;
        }
        System.out.print("null\n");
    }
    public static void main(String[] args) {
        DeleteLastOccurrenceItemFromLinkedList.Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(5);
        head.next.next.next.next.next = newNode(4);
        head.next.next.next.next.next.next = newNode(4);
        System.out.print("Created Linked list: ");
        display(head);
        deleteLast(head, 4);
        System.out.print("List after deletion of 4: ");
        display(head);
    }
}

