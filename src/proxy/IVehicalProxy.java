package proxy;

import java.lang.reflect.Proxy;

public class IVehicalProxy {

	private IVehical vehical;
	
	public IVehicalProxy(IVehical vehical) {
		this.vehical = vehical;
	}
	
	public IVehical create() {
		final Class<?>[] interfaces = new Class[]{IVehical.class};
		final IVehicalInvocationHandler handler = new IVehicalInvocationHandler(vehical);
		
		return (IVehical) Proxy.newProxyInstance(IVehical.class.getClassLoader(), interfaces, handler);
	}
	
	public static void main(String[] args) {
		IVehical car = new Car();
		IVehicalProxy proxy = new IVehicalProxy(car);
		IVehical proxyObj = proxy.create();
		proxyObj.run();
	}
	
}
