package base;

public class Node {

	int data;
	Node next;

	public Node() {

	}

	public Node(int data) {
		super();
		this.data = data;
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
