package _9_search_element_linkedlist;

import base.MyLinkedList;
import base.Node;

/* Search the element from the linked list */
public class SearchFromLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append("A");
		linkedList.append(20);
		linkedList.append("B");
		linkedList.printList();

		System.out.println("Search element :" + 5 + " (with Iterative) :: " + search_iterative(linkedList, 5));
		System.out.println("Search element :" + 5 + " (with recursion) :: " + search_recursion(linkedList, 5));

		System.out.println("Search element :" + "A" + " (with Iterative) :: " + search_iterative(linkedList, "A"));
		System.out.println("Search element :" + "A" + " (with recursion) :: " + search_recursion(linkedList, "A"));

		System.out.println("Search element :" + "B" + " (with Iterative) :: " + search_iterative(linkedList, "B"));
		System.out.println("Search element :" + "B" + " (with recursion) :: " + search_recursion(linkedList, "B"));

		System.out.println("Search element :" + 35 + " (with Iterative) :: " + search_iterative(linkedList, 35));
		System.out.println("Search element :" + 35 + " (with recursion) :: " + search_recursion(linkedList, 35));
	}

	public static <T> boolean search_iterative(MyLinkedList linkedList, T search_element) {
		if (linkedList == null || linkedList.head == null) {
			return false;
		}
		Node n = linkedList.head;
		while (n != null) {
			if (n.data == search_element)
				return true;
			n = n.next;
		}
		return false;
	}

	public static <T> boolean search_recursion(MyLinkedList linkedList, T search_element) {
		if (linkedList == null || linkedList.head == null) {
			return false;
		}
		return search(linkedList.head, search_element);
	}

	public static <T> boolean search(Node n, T search_element) {
		if (n != null) {
			if (n.data == search_element) {
				return true;
			} else {
				return search(n.next, search_element);
			}
		} else {
			return false;
		}
	}
}
