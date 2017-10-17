package lbd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LengthComparator implements Comparator<String> {

	Comparator<String> compare = (first, second)
			-> first.length() - second.length();
	
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
//		Arrays.sort(arr, new LengthComparator());
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
