package site.ss.basics.obj;

import java.io.PrintStream;
import java.time.LocalDate;

public class Employee extends Person implements Cloneable {

	public static final PrintStream ps = System.out;
	
	// instance fields
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	// constructor
	public Employee(String name, double s, int year, int month, int day) {
		super(name);
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public Employee(String name, double s) {
		super(name);
		salary = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}
	
	public void setHireDay(int year, int month, int day) {
		hireDay = LocalDate.of(year, month, day);
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + "]";
	}

	@Override
	public String getDescription() {
		return String.format("an employee with a salary of $%.2f", salary);
	}
	
	@Override
	public Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}

}
