package _12_middle_index_linkedlist;

import base.MyLinkedList;
import base.Node;

public class LinkedListSize {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
//		linkedList.append(5);
//		linkedList.append(10);
//		linkedList.append(15);
//		linkedList.append(20);
//		linkedList.append(25);
//		linkedList.append(30);
//		linkedList.append(35);
		linkedList.printList();

		Node node = middle_index(linkedList);
		String middle = (node != null) ? "" + node.data : "Not possible";
		System.out.println("Middle node :: " + middle);
	}

	public static Node middle_index(MyLinkedList linkedList) {
		if (linkedList == null || linkedList.head == null) {
			return null;
		}

		Node fast_ptr = linkedList.head;
		Node slow_ptr = linkedList.head;
		while (fast_ptr != null) {
			fast_ptr = fast_ptr.next;
			if(fast_ptr==null || fast_ptr.next==null) {
				return slow_ptr;
			}
			fast_ptr = fast_ptr.next;
			slow_ptr = slow_ptr.next;
		}
		return slow_ptr;
	}

}
