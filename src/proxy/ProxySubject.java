package proxy;

public class ProxySubject implements Subject {

	private Subject proxied;	// 被代理对象
	
	public ProxySubject(Subject proxied) {
		this.proxied = proxied;
	}

	@Override
	public void operation1() {
		System.out.println("Proxyer do operation1");
		proxied.operation1();
	}

	@Override
	public void operation2(String arg) {
		System.out.println("Proxyer do operation2 with " + arg);
		proxied.operation2(arg);
	}
	
}
