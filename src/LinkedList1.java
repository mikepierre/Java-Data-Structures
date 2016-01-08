import java.util.LinkedList;


public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("item 1");
		ll.add("item 2");
		
		System.out.println("Size of List: "+ ll.size());
		
		System.out.println("Content in LList:" + ll);
		
		ll.add("item 3");
		
		
		System.out.println("New List" + ll);
	
		for(int i = 0; i < ll.size(); i++){
			System.out.println("Result "+ i +" " + ll.get(i));
		}
		
	}

}
