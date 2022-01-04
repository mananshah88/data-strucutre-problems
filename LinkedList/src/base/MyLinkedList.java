package base;

public class MyLinkedList {
	Node head; // head of list

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
		System.out.println("===================");
		if (head == null) {
			System.out.println("Empty Linkedlist");
			return;
		}
		System.out.println("Head::" + head.data);

		Node node = head;
		while (node.next != null) {
			node = node.next;
			System.out.println(node.data);
		}
	}

	/* This method appends a node at the end of the linked list */
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

	/* This method appends a node at the front of the linked list */
	public void push(int data) {
		var node = new Node(data);
		node.next = head;
		head=node;
	}

}