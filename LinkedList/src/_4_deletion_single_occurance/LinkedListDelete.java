package _4_deletion_single_occurance;

import base.MyLinkedList;

public class LinkedListDelete {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append(15);
		linkedList.append(25);
		linkedList.printList();

		linkedList.deleteSingle(50);
		linkedList.printList();

		linkedList.deleteSingle(15);
		linkedList.printList();

		linkedList.deleteSingle(25);
		linkedList.printList();

		linkedList.deleteSingle(5);
		linkedList.printList();
		
		linkedList.deleteSingle(50);
		linkedList.printList();
	}

}
