package _15_reverse_linkedlist;

import base.MyLinkedList;
import base.Node;

/* Reverse the linked list */
public class ReverseLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append("A");
		linkedList.append(15);
		linkedList.append("B");
		linkedList.append(25);
		linkedList.append("C");
		linkedList.printList();
		reverse(linkedList);
		linkedList.printList();
	}

	public static void reverse(MyLinkedList linkedList) {
		if (linkedList == null || linkedList.head == null) {
			return;
		}
		Node previous = null;
		Node current = linkedList.head;
		Node next = linkedList.head;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		linkedList.head = previous;
	}

}
