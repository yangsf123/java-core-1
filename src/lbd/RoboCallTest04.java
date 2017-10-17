package lbd;

import java.util.List;
import java.util.function.Predicate;

public class RoboCallTest04 {

	public static void main(String[] args) {
		
		List<Person> pl = Person.createShortList();
		RoboContactMethods3 robo = new RoboContactMethods3();
		
		// Predicates
		Predicate<Person> allDrivers = p -> p.getAge() >= 16;
		Predicate<Person> allDraftees = p -> p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE;
		Predicate<Person> allPilots = p -> p.getAge() >= 23 && p.getAge() <= 65;
		
		System.out.println("\n=== Calling all Drivers ===");
		robo.mailContacts(pl, allDrivers);
		
		System.out.println("\n=== Emailing all Draftees ===");
		
		System.out.println("\n=== Mail all Pilots ===");
		robo.mailContacts(pl, allPilots);
		
		// Mix and match becomes easy
		System.out.println("\n=== Mail all Draftees ===");
		robo.mailContacts(pl, allDraftees);
		
		System.out.println("\n=== Call all Pilots ===");
		robo.phoneContacts(pl, allPilots);
		
	}
	
}
