package lbd;

public class RunnableTest {
	
	public static void main(String[] args) {
		
		System.out.println("=== RunnableTest ====");
		
		// Anonymous Runnable
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello world one!");
			}
			
		};
		
		// Lambda Runnable
		Runnable r2 = () -> System.out.println("Hello World two!");
		
		// Run em!
		r1.run();
		r2.run();
		
		LambdaInterface1 li1 = (double d1, double d2) -> d1 * d2;
		System.out.println(li1.multi(12, 12));
	}

}
