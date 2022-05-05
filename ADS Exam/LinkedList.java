import java.util.Scanner;

class LinkedList{
	Node head, pointer;
	static int n;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
		
		Node(){			
		}
	}
	
	void add(int data){
		Node temp = new Node(data);
		
		if(head == null){
			head = temp;
			return;
		}
		Node current = head;
		
		if(current.next == null){
			current.next = temp;
			return;
		}
		
		while(current.next != null){
			current = current.next;
		}
		current.next = temp;
		return;
	}

	
	void display(){
		if(head == null){
			System.out.println("List is Empty");
			return;
		}
		Node current = head;
		while(current.next != null){
			System.out.print(current.data + "->");
			current = current.next;
		}
			System.out.print(current.data + "->");
			System.out.print("NULL");
	}
	
	void reverse(){
		Node current = head;
		
		while(current.next != null){
			Node temp = new Node(current.data);
			if(pointer == null){
				pointer = temp;
			}
			
				temp.next = pointer;
				pointer = temp;
		}
	}
	
	// void displayRev(){
		// if(pointer == null){
			// System.out.println("List is Empty");
			// return;
		// }
		// Node current = pointer;
		// while(current.next != null){
			// System.out.print(current.data + "->");
			// current = current.next;
		// }
			// System.out.print(current.data + "->");
			// System.out.print("NULL");
	// }
	

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		
		int testCase = input.nextInt();				// select test case
		n = input.nextInt();					// no of elements
		int data;
		for(int i = 0; i < n; i++){
			data = input.nextInt();
			ll.add(data);
		}
		
		ll.display();
		// ll.displayRev();
		
	}

}