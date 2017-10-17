package proxy;

public class RealSubject implements Subject {

	@Override
	public void operation1() {
		System.out.println("Realer do operation1");
	}

	@Override
	public void operation2(String arg) {
		System.out.println("Realer do operation2 with " + arg);
	}

}
