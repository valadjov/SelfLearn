package SelfLearn.Enums;

public enum People {
	Georgy("27", "is learning Java"),
	Laure("24", "is at work");
	
	private final String age;
	private final String occupation;
	
	People(String currentAge, String currentOccupation){
		this.age = currentAge;
		this.occupation = currentOccupation;
	}

	public String getAge() {
		return age;
	}

	public String getOccupation() {
		return occupation;
	}
	
	

}
