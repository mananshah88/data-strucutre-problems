package _8_size_of_the_linkedlist;

import base.MyLinkedList;
import base.Node;

public class LengthOfLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append(15);
		linkedList.append(20);
		linkedList.append(25);
		linkedList.append(30);
		linkedList.printList();

		System.out.println("Size of the linked list (with Iterative) :: " + size_iterative(linkedList));
		System.out.println("Size of the linked list (with recursion) :: " + size_recursion(linkedList));
	}

	public static int size_iterative(MyLinkedList linkedList) {
		if (linkedList == null || linkedList.head == null) {
			return 0;
		}
		Node n = linkedList.head;
		int length = 1;
		while (n.next != null) {
			n = n.next;
			length++;
		}
		return length;
	}

	public static int size_recursion(MyLinkedList linkedList) {
		if (linkedList == null || linkedList.head == null) {
			return 0;
		}
		return count(linkedList.head);
	}

	public static int count(Node n) {
		if (n != null) {
			return 1 + count(n.next);
		}
		return 0;
	}
}
