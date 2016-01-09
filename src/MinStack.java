import java.util.Stack;


public class MinStack  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int push(int value){
		int newMin = Math.min(value, min());
		return newMin;
	}
	
	public int min(){
		if(this.isEmpty()){
			return Integer.MAX_VALUE;
		} else {
			return Integer.MIN_VALUE;
		}

	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
}


