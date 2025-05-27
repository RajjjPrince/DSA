package linkedList;

import java.util.NoSuchElementException;


public class doublyLinkedList {
	private ListNode head;
	private ListNode tail;
	private int length;
	private class ListNode{
		
		private int data;
		private ListNode previous;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;		
			}
	}
		
		public doublyLinkedList(){
			this.head = null;
			this.tail = null;
			this.length = 0;
		}
		
		public boolean isEmpty() {
			return length == 0;
		}
		public void insertLast(int value) {
			ListNode newNode = new ListNode(value);
			if(isEmpty()) {
				head = newNode ;
			}else{
				tail.next = newNode;
			}
			newNode.previous = tail;
			tail = newNode;
			length++;
		} 
		
		public ListNode deleteLast() {
			if(isEmpty()) {
				throw new NoSuchElementException();
			}
			ListNode temp = tail;
			if(head == tail) {
				head= null;
			}else {
				tail.previous.next = null;
			}
			tail = tail.previous;
			temp.previous = null;
			length--;
			return temp;
		}
		
		
		public ListNode deleteFirst() {
			if(isEmpty()) {
				throw new NoSuchElementException();
			}
			
			ListNode temp = head;
			if(head == tail) {
				tail = null;
			}else {
				head.next.previous = null;
			}
			head= head.next;
			temp.next = null;
			
			length--;
			return temp;
			
			
		}
		
		public void insertFirst(int value) {
			ListNode newNode = new ListNode (value);
			if(isEmpty()) {
				tail = newNode;
			}else {
				head.previous = newNode;
			}
			newNode.next = head;
			head = newNode;
			length++;
		}
		 public void displayForward() {
			 ListNode curr = head;
			 while(curr!= null) {
				 System.out.print(curr.data +"-->");
				 curr = curr.next;
			 }
			 System.out.print("null");
			 System.out.println();
		 }
		
		 public void displayBackward() {
			 ListNode curr = tail;
			 while(curr!= null) {
				 System.out.print(curr.data +"-->");
				 curr = curr.previous;
			 }
			 System.out.print("null");
			 System.out.println();
		 }
		
		
		public static void main(String[] args) {
			doublyLinkedList dll = new doublyLinkedList();
			dll.insertLast(0);;
			dll.insertLast(0);
			dll.insertLast(0);
			dll.insertLast(5);
			
			dll.displayForward();
			dll.displayBackward();
			
			dll.insertFirst(2);
			
			dll.displayForward();
			dll.displayBackward();
			System.out.println(dll.length);
			
			dll.deleteFirst();
			dll.displayForward();
			System.out.println(dll.deleteLast().data);
			//dll.deleteLast();
			dll.displayForward();
			
			
		}
	
}
