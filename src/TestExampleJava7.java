import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestExampleJava7 {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person(60,"Charles", "Dickens"),
				new Person(42,"Lewis", "Carroll"),
				new Person(51,"Thomas", "Carlyle"),
				new Person(45,"Charlotte", "Bronte"),
				new Person(30,"Matthew", "Arnold")
		);
			
		//Step 1: Sort list by last name
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		System.out.println("Print all Persons");
		// Step 2: Create a method which prints all the elements of list
		printAllPeople(persons);
		
		
		// Step 3 : Create a method which prints all the people that have last name beginning with C
		System.out.println("Print all Persons starting with C");
		printAllPersonStartingWithC(persons);
	}

	private static void printAllPersonStartingWithC(List<Person> persons) {
		for(Person person : persons) {
			if(person.getFirstName().startsWith("C")) {
				System.out.println(person);
			}
		}
	}

	private static void printAllPeople(List<Person> persons) {
		for(Person person: persons){
			System.out.println(person);	
		}
	}

}
