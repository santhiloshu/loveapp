package String;

public class Palindrome1 {

	public static void main(String[] args) {
		if(isPalinrome("madams"))
		{
			System.out.println("string is palindrome");
		}
		else
			System.out.println("String is not palindriome");

	}
public static boolean isPalinrome(String str){
	char[] ch=str.toCharArray();
	int start=0;
	int end=str.length()-1;
	while(start<end)
	{
		if(ch[start]!=ch[end])
		{
			return false;
		}
		start++;
		end--;
	}
	
	return true;
}
}
