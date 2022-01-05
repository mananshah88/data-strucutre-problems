package _10_search_nth_index_linkedlist;

import base.MyLinkedList;
import base.Node;

public class LinkedListSize {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append(15);
		linkedList.append(20);
		linkedList.append(25);
		linkedList.printList();

		String val = "";
		int search_index = 0;

		search_index = 0;
		Node node_iterative = search_iterative(linkedList, search_index);
		val = node_iterative != null ? "" + node_iterative.data : "Not found";
		System.out.println("Search element :" + search_index + " (with iterative) :: " + val);

		Node node_recursive = search_recursion(linkedList, search_index);
		val = node_recursive != null ? "" + node_recursive.data : "Not found";
		System.out.println("Search element :" + search_index + " (with recursion) :: " + val);

		search_index = 3;
		node_iterative = search_iterative(linkedList, search_index);
		val = node_iterative != null ? "" + node_iterative.data : "Not found";
		System.out.println("Search element :" + search_index + " (with iterative) :: " + val);

		node_recursive = search_recursion(linkedList, search_index);
		val = node_recursive != null ? "" + node_recursive.data : "Not found";
		System.out.println("Search element :" + search_index + " (with recursion) :: " + val);

		search_index = 6;
		node_iterative = search_iterative(linkedList, search_index);
		val = node_iterative != null ? "" + node_iterative.data : "Not found";
		System.out.println("Search element :" + search_index + " (with iterative) :: " + val);

		node_recursive = search_recursion(linkedList, search_index);
		val = node_recursive != null ? "" + node_recursive.data : "Not found";
		System.out.println("Search element :" + search_index + " (with recursion) :: " + val);
	}

	public static Node search_iterative(MyLinkedList linkedList, int search_index) {
		if (linkedList == null || linkedList.head == null) {
			return null;
		}
		int i = 0;
		Node n = linkedList.head;
		while (n != null) {
			if (i == search_index)
				return n;
			n = n.next;
			i++;
		}
		return null;
	}

	public static Node search_recursion(MyLinkedList linkedList, int search_index) {
		if (linkedList == null || linkedList.head == null) {
			return null;
		}
		int index = 0;
		return search(linkedList.head, index, search_index);
	}

	public static Node search(Node n, int index, int search_index) {
		if (n != null) {
			if (index == search_index) {
				return n;
			} else {
				return search(n.next, index + 1, search_index);
			}
		} else {
			return null;
		}
	}
}
