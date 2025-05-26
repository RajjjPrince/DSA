package linkedList;



public class SearchAElement {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public  ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null");
		System.out.println();
	}
	
	
	public boolean search(int searchKey) {
		ListNode current = head;
		while (current != null ) {
			if (current.data == searchKey) {return true;
		}
			current = current.next;
		}
		return false;
	}
	
	public ListNode reverse() {
		if(head == null) return head;
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
		return head;
			
	}
	
	
	public static void main(String [] args) {
		SearchAElement sll = new SearchAElement();
		sll.head = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(7);
		ListNode fifth = new ListNode(9);
		ListNode sixth = new ListNode(11);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		sll.display();
		if(sll.search(3)) {
			System.out.println("This node is present in linkedlist");
		}else {
			
			System.out.println("This node is not present in linkedlist");
		}
		sll.reverse();

		sll.display();
		
	}
}




	