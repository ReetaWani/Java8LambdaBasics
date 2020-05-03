import java.util.Arrays;
import java.util.List;

public class CollectionIterationJava8 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person(60,"Charles", "Dickens"),
				new Person(42,"Lewis", "Carroll"),
				new Person(51,"Thomas", "Carlyle"),
				new Person(45,"Charlotte", "Bronte"),
				new Person(30,"Matthew", "Arnold")
		);
		
		System.out.println("Normal for loop");
		for(int i= 0; i<persons.size(); i++) {
			System.out.println(persons.get(i));
		}
		
		System.out.println("For in loop");
		for(Person p : persons) {
			System.out.println(p);
		}

		System.out.println("Foreach loop");
		persons.forEach(p-> System.out.println(p));
		
		System.out.println("Foreach loop with method reference");
		persons.forEach(System.out::println);
	}
}
