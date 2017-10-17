package site.ss.basics.enums;

import java.util.Scanner;

public class EnumTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTAR_LARGE) ");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("size = " + size);
		System.out.println("abbreviation = " + size.getAbbraviation());
		if(size == Size.EXTRA_LARGE) {
			System.out.println("Good job--you paid attention to the _.");
		}
		
	}
	
}
