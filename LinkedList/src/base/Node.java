package base;

public class Node <T> {

	public T data;
	public Node next;

	public Node() {

	}

	public Node(T data) {
		super();
		this.data = data;
	}

	public Node(T data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
