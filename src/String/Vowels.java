package String;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Vowels {
	public static void main(String[] args) {
		
	String build=removeVowels("santhi");
	System.out.println(build);
		
	}
	public static String removeVowels(String str)
	{
		List<Character> list=Arrays.asList('a','e','i','o','u');
		char[] ch=str.toCharArray();
		StringBuilder builder=new StringBuilder();
		for(Character c:ch)
		{
			if(!list.contains(c))
			{
				builder.append(c);
			}
		}
		return builder.toString();
	}

}
