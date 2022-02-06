package Inheritace;
class A
{
	public void show()throws Exception
	{
		System.out.println("class A show");
	}
}
class  B extends A 
{
	public void show()
	{
		System.out.println("class b show");
	}
	public String show( String name)
	{
		name="santhi";
		return name;
	}
}

public class Inhertance1 {

	public static void main(String[] args) throws Exception {
		
		A a=new B();
		a.show();

	}

}
