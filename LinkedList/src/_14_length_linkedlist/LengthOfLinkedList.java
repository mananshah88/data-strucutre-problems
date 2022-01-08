package _14_length_linkedlist;

import base.MyLinkedList;
import base.Node;

/* Calculate the size of the cyclic linked list */
public class LengthOfLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append("A");
		linkedList.append(15);
		linkedList.append("B");
		linkedList.append(25);
		linkedList.append("C");

		linkedList.head.next.next.next.next.next.next = linkedList.head.next;

		System.out.println("Is loop detected? :: " + length_linkedlist(linkedList));
	}

	public static int length_linkedlist(MyLinkedList linkedList) {
		if (linkedList == null || linkedList.head == null) {
			return 0;
		}
		if (linkedList.head.next == null) {
			return 1;
		}
		
		Node fast_ptr = linkedList.head;
		Node slow_ptr = linkedList.head;

		fast_ptr = fast_ptr.next.next;
		slow_ptr = slow_ptr.next;
		int length = 2;

		while (fast_ptr != slow_ptr) {
			fast_ptr = fast_ptr.next;
			if (fast_ptr == null || fast_ptr.next == null) {
				break;
			}
			fast_ptr = fast_ptr.next;
			slow_ptr = slow_ptr.next;
			length++;
		}
		return length;
	}

}
