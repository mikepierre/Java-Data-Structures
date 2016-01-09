import java.util.Stack;


public class MinStack  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public static void push(int value){
		int newMin = Math.min(value, min());
		super.push("");
	}
	
	public static int min(){
		if(this.isEmpty()){
			return Integer.MAX_VALUE;
		} else {
			return peek().min;
		}

	}
	
}


