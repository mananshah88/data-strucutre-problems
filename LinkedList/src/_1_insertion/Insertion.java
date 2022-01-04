package _1_insertion;

import base.MyLinkedList;

public class Insertion {

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
