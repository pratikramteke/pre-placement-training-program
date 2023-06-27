Node flatten(Node root)
    {
	// Your code here
	Node currHead = root;
	int size = 0;
	Node currBottom = null;
	ArrayList<Integer> list = new ArrayList<>();
	
	while(currHead != null){
	    currBottom = currHead;
	    while(currBottom != null){
	        list.add(currBottom.data);
	        size++;
	        currBottom = currBottom.bottom;
	    }
	    
	    currHead = currHead.next;
	}
	
    Node ans = new Node(0);
    Collections.sort(list);
    root = ans;
    //System.out.println(list);
    
    for(int i = 0 ;i<size;i++){
       // root.data = list.get(i);
        ans.bottom = new Node(list.get(i)); 
        ans = ans.bottom;
    }
	
	    return root.bottom;
    }