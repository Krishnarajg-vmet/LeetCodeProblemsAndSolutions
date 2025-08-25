package AddTwoNumbers;

public class Solution {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode dummyHead = new ListNode();
		ListNode current = dummyHead;
		int carry = 0;
		
		while(l1 !=null || l2 != null || carry !=0) {
			int v1 = (l1 !=null)? l1.val : 0;
			int v2 = (l2 !=null)? l2.val : 0;
			
			int sum = v1+v2+carry;
			carry=sum / 10;
			
			current.next= new ListNode(sum%10);
			current = current.next;
			
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		
		return dummyHead.next;
	        
	    }
	
	 public static ListNode createList(int[] nums) {
	        ListNode dummy = new ListNode();
	        ListNode current = dummy;

	        for (int num : nums) {
	            current.next = new ListNode(num);
	            current = current.next;
	        }

	        return dummy.next;
	    }
	 
	 public static void printList(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val);
	            if (head.next != null) System.out.print(" -> ");
	            head = head.next;
	        }
	        System.out.println();
	    }
	 
	 public static void main(String[] args) {
		 Solution solution = new Solution();
		 
		 int[] arr1 = {2, 4, 3};
		 int[] arr2 = {5, 6, 4};
		 
		 ListNode l1 = createList(arr1);
		 ListNode l2 = createList(arr2);
		 
		 System.out.print("Input 1: ");
	        printList(l1);
	        System.out.print("Input 2: ");
	        printList(l2);
	        
	    ListNode result = solution.addTwoNumbers(l1, l2);
	    
	    System.out.println("Output :");
	    printList(result);
		 
	 }

}
