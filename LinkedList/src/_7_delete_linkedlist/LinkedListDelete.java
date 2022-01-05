package _7_delete_linkedlist;

import base.MyLinkedList;

public class LinkedListDelete {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.deleteLinkedList();
		linkedList.printList();
		
		linkedList.append(5);
		linkedList.append(15);
		linkedList.append(20);
		linkedList.append(25);
		linkedList.append(30);
		linkedList.printList();
		linkedList.deleteLinkedList();
		linkedList.printList();
	}

}
