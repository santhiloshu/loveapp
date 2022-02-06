package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysStream {

	public static void main(String[] args) {
		String[] fruits={"apple","mango","grapes","banana"};
		//Stream<String> stream=Stream.of("apple","mango","orange","grapes");
		//Stream<String> stream=Stream.of(fruits);
		Stream<String> stream=Arrays.stream(fruits);
		List<String> list=stream.collect(Collectors.toList());
		list.forEach(fruit->System.out.println(fruit));

	}

}
