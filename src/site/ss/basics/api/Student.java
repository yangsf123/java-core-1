package site.ss.basics.api;

public class Student implements Person, Named {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		
		int[] luckyNumbers = {2, 3, 5, 7, 11, 13};
		int[] clone = luckyNumbers.clone();
		clone[5] = 12;
		
		for(int i =0; i < clone.length; i++) {
			System.out.println(i + "  " + luckyNumbers[i] + "  " + clone[i]);
		}
		
	}
	
}
