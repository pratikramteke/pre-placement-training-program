class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        if(node==null||node.next ==null){
            return node;
        }
        Node forward = null;
        Node curr = node;
        Node prev = null;
        int j=0;
     while(curr!=null&&j<k){
         forward = curr.next;
         curr.next = prev ;
         prev = curr;
         curr =forward;
         j++;
     }
     if(forward!=null){
         node.next = reverse(forward,k);
     }
     return prev;
    }
}