	boolean isPalindrome(Node head)
	{
		slow_ptr = head;
		fast_ptr = head;
		Node prev_of_slow_ptr = head;
		Node midnode = null; 
		boolean res = true; 

		if (head != null && head.next != null) {
			while (fast_ptr != null
				&& fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				prev_of_slow_ptr = slow_ptr;
				slow_ptr = slow_ptr.next;
			}

			if (fast_ptr != null) {
				midnode = slow_ptr;
				slow_ptr = slow_ptr.next;
			}


			second_half = slow_ptr;
			prev_of_slow_ptr.next
				= null; 
			reverse(); 
			res = compareLists(head,
							second_half); 

			reverse(); 

			if (midnode != null) {
				// If there was a mid node (odd size case)
				// which was not part of either first half
				// or second half.
				prev_of_slow_ptr.next = midnode;
				midnode.next = second_half;
			}
			else
				prev_of_slow_ptr.next = second_half;
		}
		return res;
	}

	/* Function to check if two input lists have same data*/
	boolean compareLists(Node head1, Node head2)
	{
		Node temp1 = head1;
		Node temp2 = head2;

		while (temp1 != null && temp2 != null) {
			if (temp1.data == temp2.data) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			else
				return false;
		}

		/* Both are empty return 1*/
		if (temp1 == null && temp2 == null)
			return true;

		/* Will reach here when one is NULL
		and other is not */
		return false;
	}

	/* Push a node to linked list. Note that this function
	changes the head */
	public void push(char new_data)
	{
		/* Allocate the Node &
		Put in the data */
		Node new_node = new Node(new_data);

		/* link the old list of the new one */
		new_node.next = head;

		/* Move the head to point to new Node */
		head = new_node;
	}

	// A utility function to print a given linked list
	void printList(Node ptr)
	{
		while (ptr != null) {
			System.out.print(ptr.data + "->");
			ptr = ptr.next;
		}
		System.out.println("NULL");
	}

	
	}
}
