public static Node addOne(Node head) 
    { 
        if(head == null) return head; 

        Node returnednode = addOne(head.next);
        
        if(returnednode == null){
            head.data = head.data + 1;
            return head;
        }else if(returnednode.data == 10){
            returnednode.data = 0;
            head.data = head.data+1;
            return head;
        }else{
            return head;
        }
    }