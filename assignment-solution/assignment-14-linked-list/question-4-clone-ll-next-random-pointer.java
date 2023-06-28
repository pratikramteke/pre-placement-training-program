class Node {
    int data;
    Node next, arb;

    Node(int d) 
    { 
        data = d;
        next = arb = null; 
        
    }
}

class Clone {
    Node copyList(Node head) {
        if (head == null) {
            return null;
        }

        Map<Node, Node> nodeMap = new HashMap<>();

        Node curr = head;
        while (curr != null) {
            nodeMap.put(curr, new Node(curr.data));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            Node clonedNode = nodeMap.get(curr);
            clonedNode.next = nodeMap.get(curr.next);
            clonedNode.arb = nodeMap.get(curr.arb);
            curr = curr.next;
        }

        return nodeMap.get(head);
    }
}
