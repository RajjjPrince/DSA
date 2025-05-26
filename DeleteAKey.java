package linkedList;



public class DeleteAKey {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
			
		}
	}
	
	public void display() {
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.data +"-->");
			curr = curr.next;
		}
		System.out.print("null");
		System.out.println();
		
	}
	
	public void removeKey(int key){
		if(head == null) return;
		ListNode temp = null;
		ListNode curr = head;
		while(curr != null && curr.data != key) {
			temp = curr;
			curr = curr.next;
		}
		if (curr == null ) return ;
		temp.next = curr.next;
	}
	
	public static void main(String [] args) {
		DeleteAKey sll = new DeleteAKey();
		sll.head = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(8);
		ListNode fifth = new ListNode(9);
		ListNode sixth = new ListNode(10);
		ListNode seventh = new ListNode(11);
		ListNode eight = new ListNode(15);
		
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eight;
		
		sll.display();
		
		sll.removeKey(11);
		sll.display();
		
		
	}
}
