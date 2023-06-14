class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (n > count)
            return -1;
        count = count - n;
        Node temp1 = head;
        for (int i = 0; i < count; i++)
            temp1 = temp1.next;

        return temp1.data;
    }
}