package linkedList;

public class LoopLength {
	private Node head;
	private static class Node {
		private int data;
		private Node next;
	
		public Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
	public void display() {
		Node curr= head;
		while(curr!= null) {
			System.out.print(curr.data+"-->");
			curr = curr.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public static int findLength(Node slow , Node fast) {
		int cnt = 1;
		fast = fast.next;
		while(fast!= slow) {
			cnt ++;
			fast = fast.next;
		}
		return cnt;
	}
	public static int lengthOfLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return findLength(slow,fast);
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		LoopLength sll = new LoopLength();
		sll.head = new Node (1);
		Node second = new Node(3);
		Node third = new Node(5);
		Node fourth = new Node(7);
		Node fifth = new Node(9);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = second;
		if(lengthOfLoop(sll.head)>0) {
			System.out.println("Length of the loop is "+ lengthOfLoop(sll.head));
		}else {
			System.out.println("No Loop was found.");
		}
	}
}