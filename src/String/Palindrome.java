package String;

public class Palindrome {

	public static void main(String[] args) {
		boolean b=isPalindrome("madams");
		System.out.println(b);
	}
	public static boolean isPalindrome(String str )
	{
		
			char[] characters=str.toCharArray();
			int start=0;
			int end=str.length()-1;
			while(start<end)
			{
				
				if(characters[start]!=characters[end]){
				return false;
			}
			
			start++;
			end--;
			
		}
	return true;
}
	}


