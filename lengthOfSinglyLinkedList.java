package linkedList;

public class lengthOfSinglyLinkedList {
	




		private  ListNode head;
		private static class ListNode {
			private int data;
			private ListNode next;

			public ListNode(int data) {
				this.data = data;
				this.next = null;
			}
		}
		public void display() {
			ListNode current = head;
			while (current != null) {
				System.out.print(current.data+"-->");
				current = current.next;
			}
			System.out.print("null");
		}
		public int length() {
			int count = 0;
			ListNode current = head;
			while(current != null) {
				count++;
				current = current.next;
			}
			return count;
		}

		public static void main(String[] args) {
			lengthOfSinglyLinkedList  sll = new lengthOfSinglyLinkedList();
			sll.head = new ListNode(1);
			ListNode second = new ListNode(3);
			ListNode third = new ListNode(4);
			ListNode fourth = new ListNode(5);
			
			sll.head.next = second;
			second.next = third;
			third.next = fourth;
			
			
			/*ListNode current = sll.head; The main method is static, so it cannot access non-static members like head directly.
			while (current != null) {
				System.out.print(current.data+"-->");
				current = current.next;
			}
			System.out.print("null");

		}*/
			//sll.display();
			System.out.println(sll.length());
		}

	}


