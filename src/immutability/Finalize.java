package immutability;


class Final
{
	int i;
	Final(int j)
	{
		i=j;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
}

public class Finalize {

	public static void main(String[] args) {
		Final f=new Final(10);
		f=null;
		System.out.println("main method");
		System.gc();



	}

}
