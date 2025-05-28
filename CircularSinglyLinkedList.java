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
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if(last == null) {
			last = newNode;
		}else {
			newNode.next = last.next;
		}
		last.next = newNode;
		length++;
	}
	public void insertEnd(int value) {
		ListNode newNode = new ListNode(value);
		if(last == null) {
			last = newNode;
			last.next = last;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
	
		length++;
	}
	
	public static void main(String[] args) {
		CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
		cll.createCircularLinkedList();
		cll.insertFirst(0);
		cll.display();
		cll.insertEnd(15);
		cll.display();
	}
}
