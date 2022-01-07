package _6_deletion_specific_position;

import base.MyLinkedList;

public class DeletAtPositionLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append(15);
		linkedList.append(20);
		linkedList.append(25);
		linkedList.append(30);
		linkedList.printList();

		linkedList.deleteAtPosition(-1);
		linkedList.deleteAtPosition(5);
		linkedList.deleteAtPosition(4);
		linkedList.deleteAtPosition(0);
		linkedList.printList();
	}

}
