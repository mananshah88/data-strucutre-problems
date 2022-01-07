package _1_insertion_at_the_end;

import base.MyLinkedList;

public class InsertionAtEndLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.printList();

		linkedList.append(5);
		linkedList.printList();

		linkedList.append(15);
		linkedList.printList();

		linkedList.append(25);
		linkedList.printList();
	}

}
