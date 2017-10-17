package innerClass;

public class OuterClass {

	private String str;
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void outerDisplay() {
		System.out.println("outerClass...");
	}
	
	class InnerClass {
		public void display() {
			// 使用外围类的属性
			str = "chenssy";
			System.out.println(str);
			// 使用外围类的方法
			outerDisplay();
		}
	}
	
	/**
	 * 推荐使用getXXX()来获取成员内部类，尤其是该内部类的构造函数无参数时
	 * @return
	 */
	public InnerClass getInnerClass() {
		return new InnerClass();
	}
	
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass inner = outerClass.getInnerClass();
		inner.display();
	}
	
}
