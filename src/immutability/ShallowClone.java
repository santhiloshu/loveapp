package immutability;
class Test implements Cloneable
{
	int i=10;
	int j=20;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}

public class ShallowClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Test t=new Test();
		System.out.println(t);
		Test t2=(Test) t.clone();
		System.out.println(t2==t);
		System.out.println(t2.i+" "+t.i);
	    

	}

}
