package linkedList;



public class DeleteANode {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next ;
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
		
		public ListNode deleteFirst() {
			if (head == null) return null;
			 ListNode temp = head;
			 head = head.next;
			 temp.next= null;
			 return temp;
			
		}
		public ListNode deleteLast() {
			if (head.next == null) return null;
			ListNode current = head;
			ListNode previous = null;
			while (current.next != null) {
				previous = current;
				current = current.next;
				
			}
			previous.next = null;
			return current;
		}
		public ListNode delete(int position) {
			if (position == 1) return null;
			else {
				ListNode previous = head;
				int count = 1;
				while (count < position - 1 && previous != null) {
					previous = previous.next;
					count++;
				}
				ListNode current = previous.next;
				previous.next = current.next;
				return current;
			}
		}
	
	
	
	public static void main(String [] args) {
		DeleteANode sll = new DeleteANode();
		sll.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(5);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display();
		System.out.println(sll.delete(2).data);
		
		
		sll.display();
		System.out.println(sll.deleteFirst().data);
		
		sll.display();
		System.out.println(sll.deleteLast().data);
		sll.display();
	}
}
	
