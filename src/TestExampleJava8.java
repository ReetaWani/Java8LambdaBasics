import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class TestExampleJava8 {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person(60,"Charles", "Dickens"),
				new Person(42,"Lewis", "Carroll"),
				new Person(51,"Thomas", "Carlyle"),
				new Person(45,"Charlotte", "Bronte"),
				new Person(30,"Matthew", "Arnold")
		);
			
		//Step 1: Sort list by last name
		Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// Step 2: Create a method which prints all the elements of list
		System.out.println("Print all Persons");
		printConditionaly(persons, t -> true);
		
		// Step 3 : Create a method which prints all the people that have last name beginning with C
		System.out.println("Print all Persons Last name starting with C");
		printConditionaly(persons, t -> t.getLastName().startsWith("C"));
		
		System.out.println("Print all Persons First name starting with C");
		printConditionaly(persons, t -> t.getFirstName().startsWith("C"));
	}

	private static void printConditionaly(List<Person> persons, Predicate<Person> predicate) {
		for(Person person : persons) {
			if(predicate.test(person)) {
				System.out.println(person);
			}
		}
		
	}
}
