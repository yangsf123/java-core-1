package lbd;

import java.util.List;
import java.util.function.Function;

public class NameTestNew {

	public static void main(String[] args) {

		List<Person> list1 = Person.createShortList();

		Function<Person, String> westernStyle = p -> {
			return "\nName: " + p.getGivenName() + " " + p.getSurName() + "\n" +
					"Age: " + p.getAge() + "  " + "Gender: " + p.getGender() + "\n" +
					"EMail: " + p.getEmail() + "\n" +
					"Phone: " + p.getPhone() + "\n" +
					"Address: " + p.getAddress();
		};
		
		System.out.println("\n=== Western List ===");
		for(Person person : list1) {
			System.out.println(person.printCustom(westernStyle));
		}
	}

}
