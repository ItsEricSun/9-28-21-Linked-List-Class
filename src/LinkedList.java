
class LinkedList<E> {
    Node<E> head; // head of list
  
    /* Linked list Node*/
    class Node<E> {
        E data;
        Node next;
  
        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(E d) { 
        data = d; 
        }
    }
    
    public LinkedList insert(LinkedList list, E data){
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
  
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
  
            // Insert the new_node at last node
            last.next = new_node;
        }
  
        // Return the list by head
        return list;
    }
    
    public LinkedList remove(LinkedList list, int index){
        // Create a new node with given data
    	if(list.head == null) {
    		System.out.println("List Empty");
    	}

    	Node current = list.head;
    	if(index == 0) {
    		list.head = current.next;
    		return list;
    	}
    	int i = 1;
    	while(current.next != null) {
    		if(index == i) {
    			current.next = current.next.next;
    			return list;
    		}
    		current = current.next;
    		i++;
    	}
    	System.out.print("Index Out of Bounds");
    	return list;
    }
    
    public void printList(LinkedList list){
        Node currNode = list.head;
   
        System.out.print("\nLinkedList: ");
   
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
   
            // Go to next node
            currNode = currNode.next;
        }
    }
    
    public int size(LinkedList list){
        Node currNode = list.head;
        int i = 0;
        while (currNode != null) {
            currNode = currNode.next;
            i++;
        }
        System.out.println("\nSize: " + i);
        return i;
    }
    
    public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.insert(l, "A");
		l.insert(l, "D");
		l.insert(l, "C");
		l.insert(l, "B");
		l.printList(l);
		l.size(l);
//		System.out.println("");
		l.remove(l, 2);

		l.printList(l);
		l.size(l);
	}


}
