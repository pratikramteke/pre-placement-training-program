public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        if(slow==head){
            while(fast.next!=slow){
                fast = fast.next;
            }
            fast.next=null;
        } else if(slow==fast){
            slow = head;
            while(slow.next!=fast.next){
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
       
    }