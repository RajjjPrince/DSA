package linkedList;
//Linked list problem 2
public class addTwoList {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public static ListNode merge(ListNode l1,ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode temp = dummy;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int a = (l1 != null)?l1.data:0;
			int b = (l2 != null )?l2.data:0;
			int sum = carry+a+b;
			carry = sum/10;
			temp.next = new ListNode(sum%10);
			temp = temp.next;
			
			if(l1 != null ) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		if(carry > 0) {
			temp.next = new ListNode(carry);
		}
		
		return dummy.next;
	}
	public void display() {
		ListNode curr = head;
		while(curr != null) {
			System.out.print(curr.data+"-->");
			curr = curr.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public static void main(String[] args) {
		addTwoList sll1 = new addTwoList();
		sll1.head = new ListNode (2);
		ListNode sec = new ListNode(4);
		ListNode thr = new ListNode(3);
		
		sll1.head.next = sec;
		sec.next =thr;
		sll1.display();
		addTwoList sll2 = new addTwoList();
		sll2.head = new ListNode (4);
		ListNode second = new ListNode(6);
		ListNode third = new ListNode(5);
		
		sll2.head.next = second;
		second.next = third;
		sll2.display();
		 
		addTwoList result = new addTwoList();
		result.head = merge(sll1.head,sll2.head);
		result.display();
	}
}
