package optional;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {

    Integer[] numbers=new Integer[5];
    Optional<Integer> opt=Optional.ofNullable(numbers[4]);
   opt.ifPresent(n->System.out.print(n));
   opt.orElse(1);

	}

}
