package lbd;

import java.util.List;

public class RoboCallTest03 {

	public static void main(String[] args) {
		
		List<Person> pl = Person.createShortList();
		RoboContactMethods2 robo = new RoboContactMethods2();
		
		System.out.println("\n==== Test 03 ====");
		System.out.println("\n=== Calling all Drivers ===");
		robo.phoneContacts(pl, new MyTest<Person>(){

			@Override
			public boolean test(Person t) {
				return t.getAge() >= 16;
			}
			
		});
		
		System.out.println("\n=== Emailing all Draftees ===");
		robo.emailContacts(pl, new MyTest<Person>() {
			
			@Override
			public boolean test(Person t) {
				return t.getAge() >= 18 && t.getAge() <= 25 && t.getGender() == Gender.MALE;
			}
		});
		
		System.out.println("\n=== Mail all Pilots ===");
		robo.mailContacts(pl, new MyTest<Person>() {
			
			@Override
			public boolean test(Person t) {
				// TODO Auto-generated method stub
				return t.getAge() >= 23 && t.getAge() <= 65;
			}
		});
		
	}
	
}
