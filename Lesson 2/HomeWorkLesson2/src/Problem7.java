import java.util.ArrayList;


public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int inputNumber = 22;
		
		ArrayList<Integer> euroList = new ArrayList<Integer>();
		
		for (int i = 3; i <= inputNumber; i++) {
			
			if (i % 3 == 0) {
				
				euroList.add(i);
			}
			
		}
		
		String outputNumber = euroList.toString();
	
		
		System.out.println(outputNumber.replace("[", "").replace("]", ""));
	}

}
