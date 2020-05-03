import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamJava8 {

	public static void main(String[] args) {
		
		List<String> characterList = Arrays.asList("abc","xyz","", "pqrst","", "test");
		System.out.println("List without filtration:");
		characterList.forEach(System.out::println);
		List<String> filteredList = characterList.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("List with filtration:");
		filteredList.forEach(System.out::println);
		
		List<Integer> numberList = Arrays.asList(3,5,4,6,4,7,9,8,5);
		List uniqueList = numberList.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		uniqueList.forEach(System.out::println);
		
		long count = characterList.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println("Count of empty Strings :"+count);

	}

}
