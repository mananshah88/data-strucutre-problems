package _11_search_nth_index_last_linkedlist;

import base.MyLinkedList;
import base.Node;

public class LinkedListSize {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append(10);
		linkedList.append(15);
		linkedList.append(20);
		linkedList.append(25);
		linkedList.append(30);
		linkedList.printList();

		int search_index = 0;
		var val = "";

		search_index = 2;
		Node node_iterative = search_iterative(linkedList, search_index);
		val = node_iterative != null ? "" + node_iterative.data : "Not found";
		System.out.println("Search index :: " + search_index + " (with iterative) :: " + val);
	}

	public static Node search_iterative(MyLinkedList linkedList, int nth_last_index) {
		if (linkedList == null || linkedList.head == null) {
			return null;
		}

		Node fast_ptr = linkedList.head;
		Node slow_ptr = linkedList.head;
		for (int i = 0; i < nth_last_index; i++) {
			if (fast_ptr == null) {
				System.out.println("Linked list size::" + i + " is less then the provided index:" + nth_last_index);
				return null;
			}
			fast_ptr = fast_ptr.next;
		}

		while (fast_ptr != null) {
			fast_ptr = fast_ptr.next;
			slow_ptr = slow_ptr.next;
		}
		return slow_ptr;
	}

}
