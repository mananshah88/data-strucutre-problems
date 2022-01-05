package base;

public class MyLinkedList {
	public Node head; // head of list

	public MyLinkedList() {
		super();
	}

	public MyLinkedList(Node head) {
		super();
		this.head = head;
	}

	@Override
	public String toString() {
		return "LinkedList [head=" + head + "]";
	}

	/* This method prints the linked list */
	public void printList() {
		if (head == null) {
			System.out.println("Empty Linkedlist");
			System.out.println("===================");
			return;
		}
		System.out.println("Head::" + head.data);

		Node node = head;
		while (node.next != null) {
			node = node.next;
			System.out.println(node.data);
		}
		System.out.println("===================");
	}

	/* This method appends a node/key at the end of the linked list */
	public void append(int data) {
		var node = new Node(data);
		if (head == null) {
			head = node;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	/* This method appends a node/key at the front of the linked list */
	public void push(int data) {
		var node = new Node(data);
		node.next = head;
		head = node;
	}

	/* This method appends a node/key after the given node */
	public void insertAfter(Node node, int new_data) {
		if (head == null) {
			System.out.println("Empty Linkedlist");
			System.out.println("===================");
			return;
		}
		Node n = head;
		while (n != null && n.data != node.data) {
			n = n.next;
		}
		if (n == null) {
			System.out.println("Node " + new_data + " not found");
			System.out.println("===================");
			return;
		}
		var new_node = new Node(new_data);
		new_node.next = n.next;
		n.next = new_node;
	}

	/* This method deletes a given node/key */
	public void deleteSingle(int data) {
		if (head == null) {
			System.out.println("Cannot delete!!! Empty Linkedlist");
			System.out.println("===================");
			return;
		}
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node curr_node = head;
		Node next_node = head.next;
		while (next_node != null && next_node.data != data) {
			curr_node = next_node;
			next_node = next_node.next;
		}
		if (next_node == null) {
			System.out.println("Node not found");
			System.out.println("===================");
			return;
		}
		curr_node.next = next_node.next;
	}

	/* This method deletes a given node/key for all the occurrences */
	public void deleteMultiple(int data) {
		if (head == null) {
			System.out.println("Cannot delete!!! Empty Linkedlist");
			System.out.println("===================");
			return;
		}
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node curr_node = head;
		Node next_node = head.next;

		while (next_node != null) {
			if (next_node.data == data) {
				curr_node.next = next_node.next;
				next_node = next_node.next;
			} else {
				curr_node = next_node;
				next_node = next_node.next;
			}
		}
	}

	/*
	 * This method deletes a given node/key for the specific position... Assumption:
	 * Position starts from 0
	 */
	public void deleteAtPosition(int position) {
		if (head == null) {
			System.out.println("Cannot delete!!! Empty Linkedlist");
			System.out.println("===================");
			return;
		}
		if (position == 0) {
			head = head.next;
			return;
		}
		int i = 1;
		boolean isFound = false;
		Node curr_node = head;
		Node next_node = head.next;
		while (next_node != null) {
			if (i == position) {
				curr_node.next = next_node.next;
				next_node = next_node.next;
				isFound = true;
				break;
			} else {
				curr_node = next_node;
				next_node = next_node.next;
				i++;
			}
		}
		if (!isFound) {
			System.out.println("Invalid position in Linkedlist!!");
			System.out.println("===================");
		}
	}

	/* This method deletes the linked list */
	public void deleteLinkedList() {
		if (head == null) {
			System.out.println("Already empty Linkedlist");
			System.out.println("===================");
		} else {
			head = null;
		}
	}

}
