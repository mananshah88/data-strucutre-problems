package _2_insertion_at_the_front;

import base.MyLinkedList;

public class Insertion {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append(15);
		linkedList.append(25);
		linkedList.printList();
		linkedList.push(3);
		linkedList.printList();
		linkedList.push(1);
		linkedList.printList();
	}

}
