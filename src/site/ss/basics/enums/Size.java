package site.ss.basics.enums;

public enum Size {
	
	SMALL("S"),
	MEDIUM("M"),
	LARGE("L"),
	EXTRA_LARGE("XL");
	
	private Size(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	public String getAbbraviation() {
		return this.abbreviation;
	}

	
	private String abbreviation;
}
