package reflects;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOfTest {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		a = (int[])goodCopyOf(a,10);
		System.out.println(Arrays.toString(a));
		
		String[] b = {"Tom", "Dick", "Harry"};
		b = (String[]) goodCopyOf(b,10);
		
		System.out.println("The following call will generate an exceprion.");
		b = (String[]) badCopyOf(b, 10);
	}
	
	/**
	 * This method attempts to grow an array by allocating a new array and coping all elements.
	 * @param a
	 * @param newLength
	 * @return
	 */
	public static Object[] badCopyOf(Object[] a, int newLength) {
		Object[] newArray = new Object[newLength];
		System.arraycopy(a, 0, newArray, 0, newLength);
		return newArray;
	}
	
	/**
	 * This method grows an array by allocating a new array of the same type and coping all elements.
	 * @param a
	 * @param newLength
	 * @return
	 */
	public static Object goodCopyOf(Object a, int newLength) {
		
		Class cl = a.getClass();
		if(!cl.isArray()) {
			return null;
		}
		
		Class componentType = cl.getComponentType();
		int length = Array.getLength(a);
		Object newArray = Array.newInstance(componentType, newLength);
		System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
		return newArray;
	}
	
}
