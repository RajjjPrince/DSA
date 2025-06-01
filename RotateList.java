package linkedList;

public class RotateList {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null; 
		}
	}
	public static ListNode insertNode(ListNode head,int val) {
		ListNode newNode = new ListNode(val);
		if(head == null) {
			head = newNode;
			return head;
		}
		ListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return head;
	}
	public static ListNode rotate(ListNode head, int k) {
		if(head == null || head.next == null || k == 0) return head;
		for(int i = 0; i < k ; i++) {
			ListNode temp = head;
			while(temp.next.next != null ) temp = temp.next;
			ListNode end = temp.next;
			temp.next = null;
			end.next = head;
			head = end;
		}
		return head;
	}
	public void display(ListNode head) {
		ListNode curr = head;
		while(curr != null) {
			System.out.print(curr.data+"-->");
			curr = curr.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public static void main(String[] args) {
		RotateList sll = new RotateList();
		sll.head = null;
		 sll.head = insertNode(sll.head, 1);
		 sll.head = insertNode(sll.head, 2);
		 sll.head = insertNode(sll.head, 3);
		 sll.head = insertNode(sll.head, 4);
		 sll.head = insertNode(sll.head, 5);
		 sll.head = insertNode(sll.head, 6);
		 
		 sll.display(sll.head);
		 int k = 7;
		 System.out.println("After " + k + " iterations: ");
		 ListNode newHead = rotate(sll.head,k);
		 sll.display(newHead);
	}
}
