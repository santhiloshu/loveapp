package String;

import java.util.Stack;

public class ReverseString {
	public static void main(String[] args) {
		reverseString("santhi");
	}
	public static void reverseString(String str)
	{
		
		Stack<Character> stack=new Stack();
		char[] characters=str.toCharArray();
		for(Character c:characters)
		{
			stack.push(c);
			
		}
		for(int i=0;i<characters.length;i++)
		{
			characters[i]=stack.pop();
		}
		System.out.println(characters);
	}

}
