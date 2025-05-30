package linkedList;
// LeetCode Problem 206
public class reverseLinkedList {
	private ListNode head;
	private static class ListNode {
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
			}
	}
	
	public void reverse() {
		if(head == null) return;
		ListNode curr = head;
		ListNode temp = head;
		ListNode previous = null;
		while(curr != null) {
			curr = curr.next;
			temp.next = previous;
			previous = temp;
			temp = curr;
		}
		head = previous;
	
	}
	//Leetcode problem 141
	public boolean detect() {
		if(head == null) return false;
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while(fastPtr != null && fastPtr != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if(slowPtr == fastPtr) return true;
		}
		return false;
	}
	public void display() {
		ListNode curr = head;
		while(curr != null) {
			System.out.print(curr.data +"-->");
			curr = curr.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public static void main(String[] args) {
		reverseLinkedList sll = new reverseLinkedList();
		sll.head = new ListNode(0);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode (3);
		ListNode fourth = new ListNode(4);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display();
		sll.reverse();
		sll.display();
		
		if(sll.detect()) {
			System.out.println("Loop is detected.");
		}else {
			System.out.println("Loop is not detected.");
		}
	}

}
