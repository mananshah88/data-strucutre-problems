package _15_reverse_linkedlist;

import base.MyLinkedList;
import base.Node;

public class ReverseLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append(10);
		linkedList.append(15);
		linkedList.append(20);
		linkedList.append(25);
		linkedList.append(30);
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
