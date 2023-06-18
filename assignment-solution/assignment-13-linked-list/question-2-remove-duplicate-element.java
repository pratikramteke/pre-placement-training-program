public class question-2-remove-duplicate-element {
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

    static Node removeDuplicates(Node head) {
        // Your code here
        Node t = head;
        while (t.next != null) {
            if (t.data == t.next.data)
                t.next = t.next.next;
            else
                t = t.next;
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
        Node head1 = null, head = null;
        head1 = insert(head1, 2);
        head1 = insert(head1, 2);
        head1 = insert(head1, 4);
        head1 = insert(head1, 5);

        System.out.print("First List: ");
        display(head1);

        head = removeDuplicates(head1);
        System.out.print("New List: ");
        display(head);
    }
}
