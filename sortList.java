package linkedList;



public class sortList {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode (int data) {
			this.data = data;
			this.next = null; 
		}
	}
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	private ListNode merge(ListNode l1 , ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;
		while(l1 != null && l2 != null) {
			if(l1.data < l2.data) {
				curr.next = l1;
				l1 = l1.next;
			}else {
				curr.next = l2;
				l2 = l2.next;
			}
			curr = curr.next;
		}	
		
		if(l1 != null) curr.next = l1;
		if(l2 != null) curr.next = l2;
			
		return dummy.next;
		
	}
	public ListNode Sort(ListNode head) {
		if (head == null || head.next == null) {
	        return head; 
	    }
		ListNode slow = head , fast = head;
		ListNode prev = null;
		//mid node
		while (fast != null && fast.next != null) {
			prev = slow ;
			slow = slow.next;
			fast = fast.next.next;
		}
		//breaking into two halves for merge sort
		prev.next = null;
		
		ListNode l1 = Sort(head);
		ListNode l2 = Sort(slow);
		return merge(l1,l2);
		}
		// remove duplicate in sorted list
	public void remove() {
		if(head == null) return ;
		ListNode curr = head;
		while(curr != null && curr.next != null) {
			if(curr.data == curr.next.data) {
				curr.next = curr.next.next;
			}else {
				curr = curr.next;
			}
		}
		
	}
		// add a node i sorted list
	


	  
	
	public static void main (String [] args) {
		sortList sll = new sortList();
		sll.head = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(8);
		ListNode fifth = new ListNode(7);
		ListNode sixth = new ListNode(4);
		ListNode seventh = new ListNode(8);
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
		sll.head = sll.Sort(sll.head);
		sll.display();
		sll.remove();
		sll.display();
		
	}
}
