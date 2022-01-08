package _13_detect_loop_linkedlist;

import base.MyLinkedList;
import base.Node;

/* Check whether linked list has cycle or not?*/
public class DetectLoopLinkedList {

	public static void main(String[] args) {
		var linkedList = new MyLinkedList();
		linkedList.append(5);
		linkedList.append("A");
		linkedList.append(15);
		linkedList.append("B");
		linkedList.append(25);
		linkedList.head.next.next.next.next.next = linkedList.head.next.next;
		//linkedList.printList();

		Boolean isLoop = is_loop(linkedList);
		System.out.println("Is loop detected? :: " + ((isLoop == null || !isLoop) ? "Not a loop" : "Yes its loop"));
	}

	public static Boolean is_loop(MyLinkedList linkedList) {
		if (linkedList == null || linkedList.head == null) {
			return null;
		}

		Node fast_ptr = linkedList.head;
		Node slow_ptr = linkedList.head;
		
		fast_ptr = fast_ptr.next;
		if (fast_ptr.next == null) {
			return null;
		}else {
			fast_ptr = fast_ptr.next;
		}
		
		while (fast_ptr != slow_ptr) {
			fast_ptr = fast_ptr.next;
			if (fast_ptr == null || fast_ptr.next == null) {
				return false;
			}
			fast_ptr = fast_ptr.next;
			slow_ptr = slow_ptr.next;
		}
		return true;
	}

}
