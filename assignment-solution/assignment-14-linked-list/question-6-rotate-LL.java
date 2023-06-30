/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        for(int i=0; i<k; i++)
        {
            Node curr = head;
            Node temp = head;
            while(curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = temp;
            head = temp.next;
            temp.next = null;
        }
        return head;
    }
}