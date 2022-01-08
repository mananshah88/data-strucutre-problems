package _3_insertion_after_the_node;

import base.MyLinkedList;
import base.Node;

/* Insert the node after the specified Node */
public class InsertionAfterNodeLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append("A");
		linkedList.append(25);
		linkedList.printList();

		linkedList.insertAfter(new Node(35), 100);
		linkedList.printList();

		linkedList.insertAfter(new Node(5), 100);
		linkedList.printList();

		linkedList.insertAfter(new Node("A"), 200);
		linkedList.printList();
	}

}
