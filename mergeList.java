package linkedList;



public class mergeList {
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static ListNode merge (ListNode a,ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode temp = dummy;
		while (a != null && b != null) {
			if(a.data <= b.data) {
				temp.next  = a;
				a = a.next;
			}else {
				temp.next = b;
				b = b.next;
			}
			temp = temp.next;
		}
		if (a == null) temp.next = b;
		else temp.next = a;
		return dummy.next;
	}
	
	
	public void display() {
		ListNode curr  = head;
		while (curr != null) {
			System.out.print(curr.data+"-->");
			curr = curr.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public static void main (String [] args) {
		mergeList sll1 = new mergeList();

		sll1.head = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(7);
		ListNode fifth = new ListNode(8);
		ListNode sixth = new ListNode(9);
		ListNode seventh = new ListNode(11);
		ListNode eight = new ListNode(13);
		ListNode nineth = new ListNode(15);
		
		mergeList sll2 = new mergeList();
		
		sll2.head = new ListNode(1);
		ListNode second2 = new ListNode(2);
		ListNode third3 = new ListNode(4);
		ListNode fourth4 = new ListNode(5);
		ListNode fifth5 = new ListNode(7);
		ListNode sixth6 = new ListNode(8);
		ListNode seventh7 = new ListNode(13);
		ListNode eight8 = new ListNode(15);
		ListNode nineth9 = new ListNode(17);
		
		sll1.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eight;
		eight.next = nineth;
		
		sll2.head.next = second2;
		second2.next = third3;
		third3.next = fourth4;
		fourth4.next = fifth5;
		fifth5.next = sixth6;
		sixth6.next = seventh7;
		seventh7.next = eight8;
		eight8.next = nineth9;
		sll1.display();
		sll2.display();
		
		
		mergeList result = new mergeList();
		result.head = merge(sll1.head,sll2.head);
		result.display();
		
	}
}
