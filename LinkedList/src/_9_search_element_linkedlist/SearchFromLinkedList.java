package _9_search_element_linkedlist;

import base.MyLinkedList;
import base.Node;

public class SearchFromLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append(15);
		linkedList.append(20);
		linkedList.append(25);
		linkedList.printList();

		int search_element = 5;
		System.out.println("Search element :" + search_element + " (with Iterative) :: "
				+ search_iterative(linkedList, search_element));
		System.out.println("Search element :" + search_element + " (with recursion) :: "
				+ search_recursion(linkedList, search_element));

		search_element = 15;
		System.out.println("Search element :" + search_element + " (with Iterative) :: "
				+ search_iterative(linkedList, search_element));
		System.out.println("Search element :" + search_element + " (with recursion) :: "
				+ search_recursion(linkedList, search_element));

		search_element = 25;
		System.out.println("Search element :" + search_element + " (with Iterative) :: "
				+ search_iterative(linkedList, search_element));
		System.out.println("Search element :" + search_element + " (with recursion) :: "
				+ search_recursion(linkedList, search_element));

		search_element = 35;
		System.out.println("Search element :" + search_element + " (with Iterative) :: "
				+ search_iterative(linkedList, search_element));
		System.out.println("Search element :" + search_element + " (with recursion) :: "
				+ search_recursion(linkedList, search_element));
	}

	public static boolean search_iterative(MyLinkedList linkedList, int search_element) {
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

	public static boolean search_recursion(MyLinkedList linkedList, int search_element) {
		if (linkedList == null || linkedList.head == null) {
			return false;
		}
		return search(linkedList.head, search_element);
	}

	public static boolean search(Node n, int search_element) {
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
