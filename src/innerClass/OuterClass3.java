package innerClass;

import innerClass.OuterClass3.InnerClass2;

public class OuterClass3 {

	private String sex;
	public static String name = "chenssy";
	
	/**
	 * 静态内部类
	 * @author yangsufang
	 *
	 */
	static class InnerClass1 {
		
		public static String _name = "chenssy_static";
		
		public void display() {
			System.out.println("OutClass name: " + name);
		}
		
	}
	
	class InnerClass2 {
		public String _name2 = "chenssy_inner";
		public void display() {
			System.out.println("OuterClass name: " + name);
		}
	}
	
	public void display() {
		System.out.println(InnerClass1._name);
		new InnerClass1().display();
		
		OuterClass3.InnerClass2 inner2 = new OuterClass3().new InnerClass2();
		System.out.println(inner2._name2);
		inner2.display();
	}
	
	public static void main(String[] args) {
		OuterClass3 out = new OuterClass3();
		out.display();
	}
	
}
