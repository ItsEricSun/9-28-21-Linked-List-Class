
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
    
    public void printList(LinkedList list){
        Node currNode = list.head;
   
        System.out.print("LinkedList: ");
   
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
   
            // Go to next node
            currNode = currNode.next;
        }
    }
    
    public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.insert(l, "A");
		l.insert(l, "B");
		l.printList(l);
		

	}


}
