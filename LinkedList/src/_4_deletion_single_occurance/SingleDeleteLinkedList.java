package _4_deletion_single_occurance;

import base.MyLinkedList;

/* Delete the matched node */
public class SingleDeleteLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append("A");
		linkedList.append(25);
		linkedList.printList();

		linkedList.deleteSingle(50);
		linkedList.printList();

		linkedList.deleteSingle("A");
		linkedList.printList();

		linkedList.deleteSingle(25);
		linkedList.printList();

		linkedList.deleteSingle(5);
		linkedList.printList();
		
		linkedList.deleteSingle(50);
		linkedList.printList();
	}

}
