class Solution {
    public static boolean detectLoop(Node head){
        Node fast = head , slow = head;
        
        
        while(fast!=null && slow!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            return true;
            
        }
        return    false;
    }
}