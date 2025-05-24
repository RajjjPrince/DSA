package linkedList;


public class InsertANode {


	private  ListNode head;
	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public int length() {
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	} 
	public void insertEnd(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next  = newNode;
		
	}

	
	
	public void insert (int value , int position) {
		ListNode newNode = new ListNode(value);
		if(position == 1) {
		newNode.next = head;
		head = newNode;
		}
		else {
			ListNode previous = head;
			int count = 1;
			while (count < position -1 && previous != null) {
				previous = previous.next;
				count ++;
			}
			ListNode current = previous.next;
			newNode.next = current;
			previous.next = newNode;
		}
	}
	
	

	public static void main(String[] args) 	{
		InsertANode  sll = new InsertANode();
		sll.head = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(5);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		
		sll.display();
		System.out.println(sll.length());
		sll.insertFirst(0);
		sll.display();
	    sll.insertEnd(16);
		sll.display();
		sll.insert(3, 2);
		sll.display();
		
	}
}
