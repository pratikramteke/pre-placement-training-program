public class MergedTwoSortedLinkedList {
    static class Node {
        int data;
        Node next;
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
    public static Node sortedMerge(Node A, Node B)
    {
        if (A == null)
            return B;
        if (B == null)
            return A;
        if (A.data < B.data) {
            A.next = sortedMerge(A.next, B);
            return A;
        }
        else {
            B.next = sortedMerge(A, B.next);
            return B;
        }
    }
    public static void main(String[] args) {
        MergedTwoSortedLinkedList.Node list1 = newNode(5);
        MergedTwoSortedLinkedList.Node list2 = newNode(2);
        list1.next = newNode(10);
        list1.next.next = newNode(15);
        list2.next = newNode(3);
        list2.next.next = newNode(20);
        list1=sortedMerge(list1,list2);
        display(list1);
    }
}