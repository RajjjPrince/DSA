package linkedList;


public class startOfLoop {
	private ListNode head;
	private static class ListNode {
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data= data;
			this.next = null;
			}
		}
	
	public ListNode loop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			
			if(slowPtr == fastPtr) return startNode(slowPtr); 
		}
		return null;
	}
	public ListNode startNode (ListNode slowPtr) {
		ListNode temp = head;
		while(slowPtr != temp) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return temp;
	}
	

	
	public static void main(String [] args ) {
		startOfLoop sll = new startOfLoop();
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
		eight.next = fifth;
		
		System.out.println(sll.loop().data);
		
	}
}
