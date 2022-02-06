package String;

import java.util.Stack;

public class Reverse1 {

	public static void main(String[] args) {
		reversestring("santhi");
		

	}
	public  static void reversestring(String str)
	{
		char[] characters=str.toCharArray();
		Stack<Character> stack=new  Stack();
		for(char ch:characters)
		{
			stack.push(ch);
		}
		for(int i=0;i<str.length();i++)
		{
			characters[i]=stack.pop();
		}
		System.out.println(characters);;
	
	}
}
