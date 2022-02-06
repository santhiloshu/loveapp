package streams;

import java.util.Random;
import java.util.stream.Stream;

public class IterateGenerateStream {

	public static void main(String[] args) {

    //Stream.iterate(1, n->n+1).limit(30).forEach(System.out::println);
    //*********************************************************************************
    Stream.generate(()->(new Random().nextInt(100))).limit(10).forEach(System.out::println);
      

	}

}
