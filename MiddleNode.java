package linkedList;

public class MiddleNode {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public ListNode mid() {
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		
		while(fastPointer != null  && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return slowPointer;
		
	}
	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data +"-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public static void main(String [] args) {
		MiddleNode sll = new MiddleNode();
		sll.head = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(8);
		ListNode fifth = new ListNode(7);
		ListNode sixth = new ListNode(4);
		ListNode seventh = new ListNode(13);
		ListNode eight = new ListNode(11);
		ListNode nineth = new ListNode(9);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eight;
		eight.next = nineth;
		sll.display();
		System.out.println(sll.mid().data);

	}
}
