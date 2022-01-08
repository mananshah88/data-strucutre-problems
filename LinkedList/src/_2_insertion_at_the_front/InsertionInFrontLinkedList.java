package _2_insertion_at_the_front;

import base.MyLinkedList;

/* Insert the node at the front of the linked list */
public class InsertionInFrontLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append("A");
		linkedList.append(25);
		linkedList.printList();
		linkedList.push(3);
		linkedList.printList();
		linkedList.push("B");
		linkedList.printList();
	}

}
