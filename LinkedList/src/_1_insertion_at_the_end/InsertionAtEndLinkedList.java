package _1_insertion_at_the_end;

import base.MyLinkedList;

/* Insert the node at the end of the linked list */
public class InsertionAtEndLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.printList();
		linkedList.append(5);
		linkedList.append(15);
		linkedList.append(25);
		linkedList.printList();

		var linkedList1 = new MyLinkedList();
		linkedList1.printList();
		linkedList1.append("A");
		linkedList1.append("B");
		linkedList1.append("C");
		linkedList1.printList();

		var linkedList2 = new MyLinkedList();
		linkedList2.printList();
		linkedList2.append(5);
		linkedList2.append("B");
		linkedList2.append(15);
		linkedList2.append("C");
		linkedList2.printList();

	}

}
