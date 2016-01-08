import java.util.EmptyStackException;
import java.util.Stack;


public class StacksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Stack st = new Stack();
	      System.out.println("stack: " + st);
	      showpush(st, 42);
	      showpush(st, 66);
	      showpush(st, 99);
	      showpop(st);
	      showpop(st);
	      showpop(st);
	      try {
	         showpop(st);
	      } catch (EmptyStackException e) {
	         System.out.println("empty stack");
	      }		

	}
	
	public static void showpush(Stack st, int a){
	    st.push(new Integer(a));
	    System.out.println("push(" + a + ")");
	    System.out.println("stack: " + st);
	}
	
	public static void showpop(Stack st){
	   System.out.print("pop -> ");
	   Integer a = (Integer) st.pop();
	   System.out.println(a);
	   System.out.println("stack: " + st);
		
	}
}
