public class question-1-greater-element {
    static class Node {
        int data;
        Node next;
    };

    static Node insert(Node head, int item) {
        Node ptr, temp;
        temp = new Node();
        temp.data = item;
        temp.next = null;

        if (head == null)
            head = temp;
        else {
            ptr = head;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = temp;
        }
        return head;
    }

    static Node newList(Node head1, Node head2) {
        Node ptr1 = head1, ptr2 = head2, ptr;
        Node head = null, temp;
        while (ptr1 != null) {
            temp = new Node();
            temp.next = null;
            if (ptr1.data < ptr2.data)
                temp.data = ptr2.data;
            else
                temp.data = ptr1.data;
            if (head == null)
                head = temp;
            else {
                ptr = head;
                while (ptr.next != null)
                    ptr = ptr.next;
                ptr.next = temp;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return head;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = null, head2 = null,  head = null;
        head1 = insert(head1, 5);
        head1 = insert(head1, 2);
        head1 = insert(head1, 3);
        head1 = insert(head1, 8);

        System.out.print("First List: ");
        display(head1);

        head2 = insert(head2, 1);
        head2 = insert(head2, 7);
        head2 = insert(head2, 4);
        head2 = insert(head2, 5);

        System.out.print("Second List: ");
        display(head2);

        head  = newList(head1, head2);
        System.out.print("New List: ");
        display(head);
    }
}
