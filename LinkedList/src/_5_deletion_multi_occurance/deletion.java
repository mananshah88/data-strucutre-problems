package _5_deletion_multi_occurance;

import base.MyLinkedList;

public class deletion {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append(15);
		linkedList.append(15);
		linkedList.append(15);
		linkedList.append(20);
		linkedList.append(25);
		linkedList.append(30);
		linkedList.printList();

		linkedList.deleteMultiple(15);
		linkedList.printList();
	}

}
