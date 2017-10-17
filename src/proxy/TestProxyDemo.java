package proxy;

public class TestProxyDemo {
	
	public static void consumer(Subject subject) {
		subject.operation1();
		subject.operation2("ZJ");
	}
	
	public static void main(String[] args) {
		RealSubject real = new RealSubject();
		System.out.println("===Without Proxy===");
		consumer(real);
		System.out.println("===Use Proxy===");
		consumer(new ProxySubject(real));
	}

}
