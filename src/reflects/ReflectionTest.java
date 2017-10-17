package reflects;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {

	public static void main(String[] args) {
		
		// read class name from command line args or user input
		String name;
		if(args.length > 0) {
			name = args[0];
		} else {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter class name (e.g. java.util.Date): ");
			name = in.next();
		}
		
		try {
			// print class name and superclass name (if != Object)
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			String modifiers = Modifier.toString(cl.getModifiers());
			if(modifiers.length() > 0) {
				System.out.println(modifiers + " ");
			}
			System.out.println("class " + name);
			
			if(supercl != null && supercl != Object.class) {
				System.out.println(" extends " + supercl.getName());
			}
			
			System.out.println("\n{\n");
			printConstructors(cl);
			System.out.println();
			printMethod(cl);
			System.out.println();
			printFields(cl);
			System.out.println("}");
			
			try {
				System.out.println(cl.newInstance().toString());
			} catch(InstantiationException e) {
				e.printStackTrace();
			} catch(IllegalAccessException i) {
				i.printStackTrace();
			}
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.exit(0);
		
	}
	
	/**
	 * Prints all constructors of a class
	 * @param cl
	 */
	public static void printConstructors(Class cl) {
		Constructor[] constructors = cl.getConstructors();
		
		for(Constructor c : constructors) {
			String name = c.getName();
			System.out.print("   ");
			String modifiers = Modifier.toString(c.getModifiers());
			if(modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print(name + "(");
			
			// print parameter types
			Class[] paramTypes = c.getParameterTypes();
			for(int j = 0; j < paramTypes.length; j++) {
				if(j > 0) System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}
	
	/**
	 * Prints all methods of a class
	 * @param cl
	 */
	public static void printMethod(Class cl) {
		Method[] methods = cl.getDeclaredMethods();
		
		for(Method m : methods) {
			Class retType = m.getReturnType();
			String name = m.getName();
			
			System.out.print("  ");
			// print modifiers, return type and method name
			String modifiers = Modifier.toString(m.getModifiers());
			if(modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print(retType.getName() + " " + name + "(");
			
			// print parameter types
			Class[] paramTypes = m.getParameterTypes();
			for(int j = 0; j < paramTypes.length; j++) {
				if(j > 0) System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}
	
	/**
	 * Prints all fields of a class
	 * @param cl
	 */
	public static void printFields(Class cl) {
		Field[] fields = cl.getFields();
		
		for(Field f : fields) {
			Class type = f.getType();
			String name = f.getName();
			System.out.print("  ");
			String modifiers = Modifier.toString(f.getModifiers());
			if(modifiers.length() > 0) {
				System.out.println(type.getName() + " " + name + ";");
			}
		}
	}
	
}