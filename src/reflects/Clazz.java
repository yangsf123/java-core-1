package reflects;

import java.util.Random;

public class Clazz {
	
	public static void main(String[] args) {
		
		Random generator = new Random();
		
		Class cl = generator.getClass();
		
		String name = cl.getName();	// name is set to "java.util.Random"
		
		System.out.println(name);
		
		try {
			cl = Class.forName("java.util.Random");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(cl.getName());
		
		cl = Double[].class;
		System.out.println(cl.getName());
	}

}
