package linkedList;

public class add1toLinkedList {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public static ListNode add(ListNode head){
		ListNode dummy = new ListNode (0);
		dummy.next = head;
		ListNode temp = dummy;
		ListNode curr = head;
		while(curr != null) {
			if(curr.data != 9) {
				temp = curr;
			}
			curr = curr.next;
		}
		temp.data += 1;
		temp = temp.next;
		while(temp != null) {
			temp.data = 0;
			temp= temp.next;
		}
		return dummy.data==1 ? dummy:dummy.next;
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
		add1toLinkedList sll = new add1toLinkedList();
		sll.head = new ListNode(9);
		ListNode sec = new ListNode(9);
		ListNode thr = new ListNode(9);
		
		sll.head.next = sec;
		sec.next = thr;
		
		sll.display();
		
		add1toLinkedList result = new add1toLinkedList();
		result.head = add(sll.head);
		result.display();

	}

}
