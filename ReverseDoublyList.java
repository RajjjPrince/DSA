package linkedList;

public class ReverseDoublyList {
	
	private static class ListNode {
		private ListNode previous;
		private ListNode next;
		private int data;
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	
	public static ListNode convertArr2DLL(int [] arr) {
		if (arr.length == 0) return null;
		ListNode head = new ListNode(arr[0]);
		ListNode prev = head;
		for(int i = 1; i< arr.length;i++) {
			ListNode temp = new ListNode(arr[i]);
			prev.next = temp;
			temp.previous = prev;
			prev = temp;
		}
		return head;
	}
	public static void print(ListNode head) {
		ListNode curr = head;
		System.out.print("null");
		while(curr != null) {
			System.out.print( "<--"+curr.data+"-->");
			curr = curr.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	
	public static ListNode reverseDLL(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode temp = null;
		ListNode curr = head;
		while(curr!= null) {
			temp = curr.previous;
			curr.previous = curr.next;
			curr.next = temp;
			curr = curr.previous;
		}
		
		return temp.previous;
	}
	public static void main(String[] args) {
		int[] arr = {12, 5, 6, 8, 4};
        
        ListNode head = convertArr2DLL(arr);

        System.out.println("Doubly Linked List Initially:  ");
        print(head);

        System.out.println("Doubly Linked List After Reversing :");

        head = reverseDLL(head);
        print(head);
		
	}

}
