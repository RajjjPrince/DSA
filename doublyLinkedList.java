package linkedList;

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
			
		}
	
}
