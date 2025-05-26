package linkedList;


public class DetectALoop {
	private ListNode head;
	private static class ListNode {
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data= data;
			this.next = null;
			}
		}
	
	public boolean loop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
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
	
	public static void main(String [] args ) {
		DetectALoop sll = new DetectALoop();
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
		
		if(sll.loop()) {
		System.out.println("Loop is detected.");
		}else {
			System.out.println("Loop is not detected.");
		}
		
	}
}
