package _7_delete_linkedlist;

import base.MyLinkedList;

/* Delete the whole linked list */
public class DeleteLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.deleteLinkedList();
		linkedList.printList();
		
		linkedList.append(5);
		linkedList.append("A");
		linkedList.append(20);
		linkedList.append("B");
		linkedList.append(30);
		linkedList.printList();
		linkedList.deleteLinkedList();
		linkedList.printList();
	}

}
