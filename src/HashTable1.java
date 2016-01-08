import java.util.Hashtable;


public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, Double> availability = new Hashtable<String, Double>();
		
		availability.put("Oct", new Double(123.40));
		availability.put("Nov", new Double(32.22));
		
		System.out.println("Hash Table Objects "+availability);
		
		System.out.println("Get Nov.price"+ availability.get("Nov"));
		

	}

}
