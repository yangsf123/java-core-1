package site.ss.basics.obj;

import java.text.NumberFormat;

public class EmployeeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// fill the staff array with three Employee objects
		Employee[] staff = new Employee[3];
		
		Manager boss = new Manager("Carl Cracker", 75000, 1987, 12, 15);
		boss.setBonues(5000);
		
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		// rase everyone's salary by 5%
		for(Employee e : staff) {
			e.raiseSalary(5);
		}
		
		// print out information about all Employee objects
		for(Employee e : staff) {
			System.out.println(e.toString());
			System.out.println("clone : " + e.clone() + " ====== " + e);
		}
		
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		
		double x = 0.1;
		
		System.out.println(currencyFormatter.format(x));
		System.out.println(percentFormatter.format(x));
		
	}
	
}
