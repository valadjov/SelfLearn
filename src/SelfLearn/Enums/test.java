package SelfLearn.Enums;

public class test {

	public static void main(String[] args) {
		for(People person : People.values())
			System.out.printf("%s\t%s\t%s\n", person, person.getAge(), person.getOccupation());

	}

}
