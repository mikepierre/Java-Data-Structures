import java.util.Stack;


public class LinkedListPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	boolean isPalindrome(LinkedListPalindrome head){
		LinkedListPalindrome fast = head;
		LinkedListPalindrome slow = head;
		
		Stack<Integer> stack = new Stack();
		
		while(fast != null && fast.next !=null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow != null){
				slow = slow.next;
			}
			
			while(slow !=null){
				int top = stack,pop().intValue();
				if(top != slow.data){
					return false;
				}
				slow = slow.next;
			}
		}
		
		return true;
		
	}
}
