package _3_insertion_after_the_node;

import base.MyLinkedList;
import base.Node;

public class Insertion {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append(15);
		linkedList.append(25);
		linkedList.printList();
		
		linkedList.insertAfter(new Node(35), 100);
		linkedList.printList();
		
		linkedList.insertAfter(new Node(5), 100);
		linkedList.printList();
		
		linkedList.insertAfter(new Node(25), 200);
		linkedList.printList();
	}

}
