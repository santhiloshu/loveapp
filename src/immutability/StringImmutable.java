package immutability;

public class StringImmutable {
	public static void main(String[] args) {
		
	Boolean b=Boolean.valueOf("TRUE");
	System.out.println(b);
	boolean b1=b.booleanValue();
	System.out.println(b1==b);
		
	} 
	

}
