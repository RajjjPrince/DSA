package linkedList;

public class CircularSinglyLinkedList {
	private ListNode last ;
	private int length;
	private class ListNode{
		private ListNode next;
		private int data;
		public  ListNode(int data) {
			this.data= data;
			this.next = null;
		}
	}
	
	public CircularSinglyLinkedList() {
		last = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void createCircularLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(9);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
		
	}
	
	public void display() {
		if(last == null) {
			return;
		}
		ListNode first = last.next;
		while(first != last) {
			System.out.print(first.data+"-->");
			first= first.next;
			
		}
		System.out.print(first.data+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
		cll.createCircularLinkedList();
		cll.display();
	}
}
