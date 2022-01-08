package _6_deletion_specific_position;

import base.MyLinkedList;

/* Delete the node of specified position */
public class DeletAtPositionLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append("A");
		linkedList.append(20);
		linkedList.append("B");
		linkedList.append(30);
		linkedList.printList();

		linkedList.deleteAtPosition(-1);
		linkedList.deleteAtPosition(5);
		linkedList.deleteAtPosition(4);
		linkedList.deleteAtPosition(1);
		linkedList.deleteAtPosition(1);
		linkedList.printList();
	}

}
